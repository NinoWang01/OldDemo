package com.pb.b;

public class SleepThreadTest {
	public static void main(String[] args) {
		// 创建线程类对象,本身也代表一个实例化的对象
		Thread mythread = new Thread("12345347") {
			@Override
			public void run() {
				// 获得当前线程
				System.out.println(super.getName() + "小明吃饭，。。。。。");
				// 吃完饭休眠线程
				try {
					Thread.sleep(2000); //停到了这里
				} catch (InterruptedException e) {
					System.out.println("线程醒了。。。。");
				}
			}
		};
		// 启动线程mythread
		mythread.start();
		// 主线程也休眠一会
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 调用Thread的intterupt()把线程从休眠的状态打断
		mythread.interrupt();

	 
		
		
	}

}
