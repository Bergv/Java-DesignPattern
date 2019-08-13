package com.designpattern.thread.t5;

public class MyRunnable03 implements Runnable {

	int num = 0;

	@Override
	public void run() {
		while (num < 100) {
			System.out.println(Thread.currentThread().getName() + " run " + num++);
		}
	}

}
