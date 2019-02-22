package com.pb.a;

public class NewThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("NewThread的run方法在执行");
		}

	}

}
