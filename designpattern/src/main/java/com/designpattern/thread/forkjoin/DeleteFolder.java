package com.designpattern.thread.forkjoin;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * DeleteFolder
 */
public class DeleteFolder {
    public static void main(String[] args) {
        
        System.out.println("开始");

        try {
            File f = new File("I:\\1");
            ForkJoinPool pool = new ForkJoinPool(4);

            long start = System.currentTimeMillis();
            
            Integer count = pool.submit(new DeleteTask(f)).get();
            
            long end = System.currentTimeMillis();

            System.out.println("count = " + count + ";   耗时 = " + (end - start) + " 毫秒");

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

class DeleteTask extends RecursiveTask<Integer> {

    private static final long serialVersionUID = 3396435878846260482L;
    private File f;

    DeleteTask(File f) {
        this.f = f;
    }

    @Override
    protected Integer compute() {
        if (!f.exists()) {
            return 0;
        }
        if (f.isFile()) {
            f.delete();
            return 1;
        }
        if (f.isDirectory()) {
            File[] fs = f.listFiles();
            if (fs.length == 0) {
                f.delete();
                return 1;
            } else {
                int r = 0;
                DeleteTask[] tasks = new DeleteTask[fs.length];
                for (int i = 0; i < fs.length; i++) {
                    tasks[i] = new DeleteTask(fs[i]);
                    // r = r + tasks[i].compute();
                    tasks[i].fork();
                    r = r + tasks[i].join();
                }
                invokeAll(tasks);

                return r;
            }
        }

        return 0;
    }

}