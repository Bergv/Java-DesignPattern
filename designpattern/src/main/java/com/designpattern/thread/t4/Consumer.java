package com.designpattern.thread.t4;

public class Consumer implements Runnable {

	private Product pro;

	public Consumer(Product pro) {
		this.pro = pro;
	}

	@Override
	public void run() {
		pro.consume();
	}

}
