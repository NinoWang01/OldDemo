package com.pb.c;

public class PersonTest {
	public static void main(String[] args) {

		// 线程不同步，导致的最直接原因，和线程并发及异步有关联
		// 创建三个对象
		Person user1 = new Person("张三");
		Person user2 = new Person("李四");
		Person user3 = new Person("王五");
//		// 另一个写法
//		synchronized (user1) {
//
//		}
		// 这一块是线程的并发，
		// 启动线程
		user1.start();// 已经取了400，剩余600
		user2.start();// 再取400 ，剩余200
		user3.start();// 余额不足，只剩200，不够取

	}

}
