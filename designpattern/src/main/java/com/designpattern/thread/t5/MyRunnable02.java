package com.designpattern.thread.t5;

public class MyRunnable02 implements Runnable {

	int num = 0;

	@Override
	public void run() {
		while (num < 10) {
			try {
				Thread.sleep(500);
				System.out.println("num : " + num++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
