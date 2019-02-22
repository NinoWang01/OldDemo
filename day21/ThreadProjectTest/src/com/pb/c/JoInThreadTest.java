package com.pb.c;

//join实现线程的同步方式一
public class JoInThreadTest {
	public static int result = 0;
	public static void main(String[] args) throws InterruptedException {
		// 创建线程对象
		Thread th = new Thread("赵六") {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 循环
				for (int i = 0; i < 10000; i++) {
					result++;
				}
			}
		};
		// 启动线程
		th.start();
		// 设置当前的线程th为主线程的子线程
		 th.join();
		System.out.println("result=" + result);
	}
}
