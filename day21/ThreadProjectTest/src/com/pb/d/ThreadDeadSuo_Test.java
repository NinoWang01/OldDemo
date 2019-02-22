package com.pb.d;

public class ThreadDeadSuo_Test {

	/*
	 * 当前应用程序当中线程比较（至少有100以上）
	 */
	public static void main(String[] args) {
		ThreadDeadSuo tds1 = new ThreadDeadSuo(true);
		ThreadDeadSuo tds2 = new ThreadDeadSuo(false);

		// 创建线程对象
		Thread th1 = new Thread(tds1);
		Thread th2 = new Thread(tds2);
		// 启动线程
		th1.start();
		th2.start();

	}

}
