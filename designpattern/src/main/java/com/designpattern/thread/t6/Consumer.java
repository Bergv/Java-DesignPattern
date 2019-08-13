package com.designpattern.thread.t6;

public class Consumer extends Thread {
	private final AbstractProductMgr mgr;

	public Consumer(AbstractProductMgr mgr) {
		super();
		this.mgr = mgr;
	}

	@Override
	public void run() {
		System.out.println("start consume Product");
		mgr.consumeProduct();
		System.out.println("end consume Product");
	}

}
