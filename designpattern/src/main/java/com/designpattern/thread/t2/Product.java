package com.designpattern.thread.t2;

public class Product {

	private int pid;
	private String name;
	private boolean isPro;

	public void produce() {
		while (true) {
			synchronized (this) {
				while (!isPro()) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				setName("牙膏");
				System.out.println(Thread.currentThread().getName() + " produce " + getName() + ", pid : " + (++pid));
				setPro(!isPro());
				notifyAll();
			}
		}
	}

	public void consume() {
		while (true) {
			synchronized (this) {
				while (isPro()) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " consume " + getName() + ", pid : " + pid);
				setPro(!isPro());
				notifyAll();
			}
		}
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPro() {
		return isPro;
	}

	public void setPro(boolean isPro) {
		this.isPro = isPro;
	}
}
