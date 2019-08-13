package com.designpattern.thread.t5;

public class MyRunnable implements Runnable {

	int num = 0;

	@Override
	public void run() {
		while (num < 10000) {
			System.out.println("num : " + num++);
		}
	}

}
