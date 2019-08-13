package com.designpattern.thread.t5;

public class JoinTest extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable02 r = new MyRunnable02();

		Thread t = new Thread(r);
		t.setName("MyRunnable02");
		t.start();
		t.join();

		Thread t2 = new JoinTest();
		t2.setName("JoinTest");
		t2.start();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println("main " + i);
		}
	}
}
