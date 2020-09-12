package com.designpattern.thread.t6;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExamProjectTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		// fail("Not yet implemented");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println("------1-------");
		System.out.println(list.get(0));

		System.out.println("------2-------");
		String remove = list.remove(0);
		System.out.println(remove + "   ------3-------");
		System.out.println(list.get(0));
	}

	@Test
	public void testProductCreateAndconsume() {
		ProductMgrImpl mgr = ProductMgrImpl.getlnstance();
		Producer p = new Producer(mgr);
		Consumer c = new Consumer(mgr);

		try {
			p.start();
			c.start();

			System.out.println(6666666);
			mgr.shutdown();

			p.join();
			c.join();
			System.out.println(6666666);
		} catch (Exception e) {
		}
		assertFalse(false);
	}

}
