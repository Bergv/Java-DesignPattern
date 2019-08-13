package com.designpattern.thread.t2;

public class Producer implements Runnable {

	private Product pro;

	public Producer(Product pro) {
		super();
		this.pro = pro;
	}

	@Override
	public void run() {
		pro.produce();
	}

}
