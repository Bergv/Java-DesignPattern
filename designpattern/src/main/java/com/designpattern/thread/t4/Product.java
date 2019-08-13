package com.designpattern.thread.t4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock是jdk1.5之后出现的一个新特性，可以替代之前的synchronized方法和语句，可以实现代码的同步（独占地执行代码）
 * Condition，条件，使用Condition对象的await（）和signal（），
 * signalAll（）方法替代了Object中的wait（）和notify，notifyAll（）方法
 * 
 * Lock l = ....; ReentrantLock是Lock接口的具体实现类，用来创建Lock对象 l.lock(); try{ //
 * 访问受保护的资源 }finally{ l.unlock(); }
 *
 * Lock lock获取锁 unlock解锁 newCondition得到此Lock对象的新的Condition实例
 *
 * Condition，替代锁对象 await() 等待 signal() 唤醒 signalAll() 唤醒所有
 *
 * 优点: 在自己的await之后，可以精确地唤醒对方，而减少线程的判断
 * 
 * @author james
 *
 */
public class Product {

	private int pid;
	private String name;
	private boolean isPro = true;

	Lock lock = new ReentrantLock();
	Condition ct = lock.newCondition();

	public void produce() {
		lock.lock();

		try {
			while (true) {
				while (!isPro) {
					try {
						ct.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				setName("牙膏");
				System.out.println(Thread.currentThread().getName() + " name : " + getName() + " pid : " + ++pid);

				setPro(!isPro);
				ct.signal(); // 喚醒其他線程對象
			}

		} finally {
			lock.unlock();
		}
	}

	public void consume() {
		lock.lock();

		try {
			while (true) {
				while (isPro) {
					try {
						ct.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " name : " + getName() + " pid : " + pid);
				setPro(!isPro);
				ct.signal();
			}
		} finally {
			lock.unlock();
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
