package com.pb.b;

public class SingelMyThread_Test {

	public static void main(String[] args) {

		// 创建线程类对象
		SingelMyThread smt = new SingelMyThread();
		// 启动线程
		smt.start();
		// 在主线程中添加一个循环
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
