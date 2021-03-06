package com.util.download.d1;

import java.util.HashMap;

/**
 * @author xbl
 * @date 2018-09-18
 */
public class Header {
    public static final HashMap<String, String> header = new HashMap<>();

    private Header() {
    }

    static {
        header.put("Accept-Encoding", "gzip, deflate");
        header.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        header.put("Cache-Control", "max-age=0");
        header.put("Connection", "keep-alive");
        header.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0");
        header.put("Accept",
                "image/gif,image/jpeg,image/pjpeg,image/pjpeg, "
                        + "application/x-shockwave-flash, application/xaml+xml, "
                        + "application/vnd.ms-xpsdocument, application/x-ms-xbap"
                        + "application/x-ms-application,application/vnd.ms-excel"
                        + "application/vnd.ms-powerpoint, application/msword,*/*");
    }

}