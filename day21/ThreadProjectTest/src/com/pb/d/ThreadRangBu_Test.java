package com.pb.d;

public class ThreadRangBu_Test {

	public static void main(String[] args) {

		// 创建两个线程对象
		Thread th1 = new ThreadRangBu("线程1");
		Thread th2 = new ThreadRangBu("线程2");
		// 启动线程
		th1.start();
		th2.start();

	}

}
