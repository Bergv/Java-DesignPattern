package com.designpattern.thread.t1;

public class BreadContainer {

	private static final int MAX_NUM = 500;

	private int currentNum;

	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}

	public synchronized void produce(int num) {
		System.out.printf("当前库存为%d, 想要生产%d箱面包\n", currentNum, num);

		try {
			while (currentNum + num > MAX_NUM) {
				System.out.println("库存已满，请等待……");
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		currentNum += num;
		System.out.printf(Thread.currentThread().getName() + "生产了%d箱面包，目前库存为%d\n", num, currentNum);
		notify();
	}

	public synchronized void consume(int num) {
		System.out.printf("当前库存为%d, 想要消费%d箱面包\n", currentNum, num);

		try {
			while (num > currentNum) {
				System.out.println("库存不足，请等待……");
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		currentNum -= num;
		System.out.printf(Thread.currentThread().getName() + "消费了%d箱面包，当前库存为%d\n", num, currentNum);
		notify();
	}
}
