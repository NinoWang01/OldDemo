package com.pb.d;

public class MyThread02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread02" + ":" + i);
		}

	}

}
