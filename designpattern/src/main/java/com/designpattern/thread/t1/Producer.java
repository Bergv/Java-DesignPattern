package com.designpattern.thread.t1;

public class Producer implements Runnable {

	private BreadContainer bc;
	private int num;

	public Producer(BreadContainer bc) {
		super();
		this.bc = bc;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		bc.produce(num);
	}
}
