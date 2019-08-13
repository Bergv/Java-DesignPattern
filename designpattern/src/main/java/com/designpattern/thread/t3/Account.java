package com.designpattern.thread.t3;

public class Account implements Runnable {

	static Bank bank;
	static boolean isStop = true;

	public Account(Bank bk) {
		bank = bk;
	}

	@Override
	public void run() {
		while (isStop) {
			synchronized (Account.class) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (bank.getMoney() > 100) {
					bank.setMoney(bank.getMoney() - 100);
					System.out.println(Thread.currentThread().getName() + " " + bank.getMoney());
				} else {
					isStop = false;
				}
			}

			getMoney();
		}
	}

	private static synchronized void getMoney() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (bank.getMoney() > 100) {
			bank.setMoney(bank.getMoney() - 100);
			System.out.println(Thread.currentThread().getName() + " method " + bank.getMoney());
		}
	}
}
