package com.designpattern.thread.t5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss S");
		while (true) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(sdf.format(new Date()));
		}
	}
}
