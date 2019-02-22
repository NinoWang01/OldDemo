package com.pb.b;

public class SingelMyThread extends Thread {

	@Override
	public void run() {

		// 添加一个循环
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
