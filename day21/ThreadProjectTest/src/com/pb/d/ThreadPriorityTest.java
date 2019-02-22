package com.pb.d;

//启动几个线程，设置了线程的优先级高低
public class ThreadPriorityTest {

	// 主线程
	public static void main(String[] args) {

		// 创建线程对象
		Thread th01 = new Thread(new MyThread01());

		Thread th02 = new Thread(new MyThread01());

		// 设置线程的优先级
		th02.setPriority(Thread.MAX_PRIORITY);
		/*
		 * 线程优先级的10个值：从1开始到10结束,1代表线程优先级最低，10代表线程优先级最高
		 */
		th01.setPriority(1);
		// 启动线程
		th02.start();
		th01.start();
		

		// 主线程添加一条输出
		System.out.println("我是主线程中的输出");

	}

}
