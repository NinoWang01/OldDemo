package com.pb.c;

import java.util.ArrayList;
import java.util.Scanner;

//线程同步方式二

/*
 * 实现一个线程输入数据，另一个线程取出数据的异步操作，并确保数据的正确性。
 (1)在一个线程中通过键盘向集合添加字符串数据。
 (2)在另一个线程中从同一个集合中取出键盘输入的所有数据并打印出来。
 要求以上线程实现异步操作，即每个线程的操作都无需等待另一个线程。并且要确保取数据的正确性。
 */
public class LikeThreadTest {
	// 创建一个集合来接受键盘的输入
	public static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		// 创建线程对象A
		Thread th_a = new Thread("asdf") {
			@Override
			public void run() {
				// 从集合中取的字符串接收变量
				String th_a_str_1 = "";
				while (true) {
					// 线程th_a休眠
					try {
						Thread.sleep(1000 * 60);
					} catch (InterruptedException e) {
						// 当线程被唤醒
						// 将集合的元素依次去除并打印
						while (list.size() > 0) {
							System.out.println(list.get(0));
							// 把当前的集合给清空了
							th_a_str_1 = list.remove(0);
							// 判断当前的字符串有没有一个字符
							if (th_a_str_1.equals("s")) {
								System.out.println("输入字符串结束");
								break;
							}
						}
						// 当线程B最后一次输入的字符符合要求的时候
						if (th_a_str_1.equals("s")) {
							break;
						}
					}
				}
			}
		};
		// 启动线程
		th_a.start();
		// 线程B的创建
		Thread th_b = new Thread("13245234") {
			@Override
			public void run() {
				while (true) {
					System.out.println("输入字符串,当输入单个以字符    s 结尾");
					// 接收从键盘上的输入字符串
					Scanner input = new Scanner(System.in);
					String th_b_str = input.next();// 接收键盘输入
					// 将字符串加入到集合当中
					list.add(th_b_str);
					// 唤醒线程A
					th_a.interrupt();
					System.out.println("2345654sdfhfdg");
				}
			}
		};
		// 启动线程B
		th_b.start();
	}
}
