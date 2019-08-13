package com.designpattern.thread.t2;

public class Test {

	public static void main(String[] args) {
		Product pro = new Product();

		Producer pr = new Producer(pro);
		Consumer cr = new Consumer(pro);

		new Thread(pr, "p1").start();
		new Thread(pr, "p2").start();

		new Thread(cr, "c1").start();
		new Thread(cr, "c2").start();
	}
}
