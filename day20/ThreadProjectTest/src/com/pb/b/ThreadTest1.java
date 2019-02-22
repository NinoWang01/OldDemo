package com.pb.b;

public class ThreadTest1 {
	public static void main(String[] args) {
		// Runnable r = new MyThread1();
		// 创建一个实现了Runnable的线程类(匿名内部类)，作为一个参数传递Thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("main" + i);
					try {
						// 让线程在运行的时候休眠
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		// Thread th=new Thread(new MyThread1());
		// th.start();

	}
}
