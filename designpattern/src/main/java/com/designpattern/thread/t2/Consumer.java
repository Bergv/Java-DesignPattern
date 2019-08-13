package com.designpattern.thread.t2;

public class Consumer implements Runnable {

	private Product pro;

	public Consumer(Product pro) {
		super();
		this.pro = pro;
	}

	@Override
	public void run() {
		pro.consume();
	}

}
