package com.pb.b;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		// 正常循环
		for (int i = 0; i < 20; i++) {
			System.out.println("Runnable" + i);
			// 让线程在运行的时候休眠
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
