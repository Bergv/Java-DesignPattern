package com.designpattern.thread.t5;

public class MyRunnable04 implements Runnable {

	int num = 0;

	@Override
	public void run() {
		while (num < 100) {

			// yield()暂停当前正在执行的线程对象，并执行其他线程
			// t2线程使用了该Runnable对象，则t2线程会暂停当前执行的线程对象，让t1多执行
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " run " + num++);
		}
	}

}
