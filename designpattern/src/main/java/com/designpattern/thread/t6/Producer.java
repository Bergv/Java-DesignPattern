package com.designpattern.thread.t6;

public class Producer extends Thread {
	private final AbstractProductMgr mgr;

	public Producer(AbstractProductMgr mgr) {
		super();
		this.mgr = mgr;
	}

	@Override
	public void run() {
		System.out.println("start create Product");
		mgr.createProduct();
		System.out.println("end create Product");
	}
}
