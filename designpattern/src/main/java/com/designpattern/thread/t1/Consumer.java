package com.designpattern.thread.t1;

public class Consumer implements Runnable {

	private BreadContainer bc;
	private int num;

	public Consumer(BreadContainer bc) {
		super();
		this.bc = bc;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		bc.consume(num);
	}
}
