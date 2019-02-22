package com.pb.a;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// 启动线程
		myThread.start();
		while (true) {
			System.out.println("main方法在运行");
		}

	}
}
