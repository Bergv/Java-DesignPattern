package com.designpattern.thread.t5;

public class StopThread {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();

		Thread t = new Thread(r);
		t.start();

		try {
			Thread.sleep(100000);
			// 遇到一个sleep（）方法，需要先调用interrupt方法将其“砸醒”， 然后改变运行条件
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		r.num = 30000;
	}
}
