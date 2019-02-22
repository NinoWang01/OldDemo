package com.pb.b;

//线程的测试类
public class UserThreadTest {
	public static void main(String[] args) throws InterruptedException {
		// 创建线程的对象
		User user = new User();//创建的仅仅是一个实现了Runnable的线程类对象
		Thread zhangchaofan = new Thread(user, "张超凡");
		Thread wenchengdong = new Thread(user, "温成东");
		// 启动张超凡的线程
		zhangchaofan.start();
		// 主线程休眠一会
		Thread.sleep(900);
		// 启动温成东的线程
		wenchengdong.start();

	}

}
