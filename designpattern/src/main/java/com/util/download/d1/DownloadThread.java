package com.util.download.d1;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

/**
 * @author xbl
 * @date 2018-09-17
 */
public class DownloadThread implements Runnable {

    // 当前线程的下载位置
    private int startPos;
    // 定义当前线程负责下载的文件大小
    private int currentPartSize;
    // 当前线程需要下载的文件块,此类的实例支持对随机访问文件的读取和写入。
    private RandomAccessFile currentPart;
    // 定义该线程已下载的字节数
    private int length;
    // 线程计数器
    private CountDownLatch latch;

    private String path;

    public DownloadThread(int startPos, int currentPartSize, RandomAccessFile currentPart, String path,
            CountDownLatch latch) {
        this.startPos = startPos;
        this.currentPartSize = currentPartSize;
        this.currentPart = currentPart;
        this.path = path;
        this.latch = latch;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            // 设置请求方法
            conn.setRequestMethod("GET");
            // 设置请求属性
            Header.header.forEach((key, value) -> conn.setRequestProperty(key, value));
            inputStream = conn.getInputStream();
            // inputStream.skip(n);跳过和丢弃此输入流中数据的 n 个字节
            inputStream.skip(this.startPos);
            byte[] buffer = new byte[1024];
            int hasRead = 0;
            // 读取网络数据写入本地
            while (length < currentPartSize && (hasRead = inputStream.read(buffer)) != -1) {
                currentPart.write(buffer, 0, hasRead);
                length += hasRead;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                currentPart.close();
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            latch.countDown();
        }
    }

    public int getLength() {
        return length;
    }
}