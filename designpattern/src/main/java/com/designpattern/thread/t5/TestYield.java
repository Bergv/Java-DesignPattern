package com.designpattern.thread.t5;

public class TestYield {

	public static void main(String[] args) {
		// MyRunnable04使用了yield（）方法，而MyRunnable03没有
		MyRunnable03 r1 = new MyRunnable03();
		MyRunnable04 r2 = new MyRunnable04();

		// t1执行的几率更大一些
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r2, "t2");

		// t1.setPriority(Thread.MIN_PRIORITY);
		// t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
