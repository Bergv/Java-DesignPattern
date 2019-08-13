package com.designpattern.thread.t3;

public class Test {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.setMoney(10000);

		Account a = new Account(bank);

		new Thread(a, "zhang").start();
		// new Thread(a, "lisi").start();
		// new Thread(a, "wang").start();
		// new Thread(a, "zhaol").start();
	}

}
