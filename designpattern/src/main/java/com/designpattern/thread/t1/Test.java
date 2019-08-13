package com.designpattern.thread.t1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		BreadContainer bc = new BreadContainer();

		bc.setCurrentNum(480);

		Producer pr = new Producer(bc);

		pr.setNum(100);
		Thread p1 = new Thread(pr, "p1");
		p1.start();

		Thread.sleep(10);

		pr.setNum(80);
		Thread p2 = new Thread(pr, "p2");
		p2.start();

		Thread.sleep(10);

		pr.setNum(60);
		Thread p3 = new Thread(pr, "p3");
		p3.start();

		Thread.sleep(10);

		pr.setNum(40);
		Thread p4 = new Thread(pr, "p4");
		p4.start();

		Thread.sleep(10);

		Consumer cr = new Consumer(bc);

		cr.setNum(120);
		Thread c1 = new Thread(cr, "c1");
		c1.start();

		Thread.sleep(10);

		cr.setNum(80);
		Thread c2 = new Thread(cr, "c2");
		c2.start();

		Thread.sleep(10);

		cr.setNum(70);
		Thread c3 = new Thread(cr, "c3");
		c3.start();

		Thread.sleep(10);

		cr.setNum(50);
		Thread c4 = new Thread(cr, "c4");
		c4.start();
	}
}
