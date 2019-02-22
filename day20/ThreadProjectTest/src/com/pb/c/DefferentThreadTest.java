package com.pb.c;

/*
 *  银行某账号有1000元存款。
 定义User线程类，该类表示一个用户每次取出400元。(创建三个用户)
 在main()中创建三个线程对象，并启动这三个线程对象，执行取钱的操作。当存款大于等于400时允许取款，否则不能取款。
 */

public class DefferentThreadTest {

	public static void main(String[] args) {

		// 创建三个对象
		User user1 = new User("张三");
		User user2 = new User("李四");
		User user3 = new User("王五");

		//这一块是线程的并发，
		// 启动线程
		user1.start();//已经取了400，剩余600
//		user2.start();//再取400 ，剩余200
//		user3.start();//余额不足，只剩200，不够取

	}

}
