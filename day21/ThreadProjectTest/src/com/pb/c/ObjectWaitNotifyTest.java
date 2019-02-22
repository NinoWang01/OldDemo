package com.pb.c;

import java.util.ArrayList;
import java.util.Scanner;

//Object obj=new Object();
//obj.wait();//线程休眠，等待
//obj.notify();//唤醒
public class ObjectWaitNotifyTest {
	// 创建一个集合来接受键盘的输入
	public static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IllegalMonitorStateException{
		// 创建线程对象A
		Thread th_a = new Thread() {
			@Override
			public void run() {
				// 从集合中取的字符串接收变量
				String th_a_str_1 = "";
				while (true) {
					for (int i = 0; i < 1000; i++) {
						th_a_str_1 += "a";
					}
					// 当线程被唤醒
					// 将集合的元素依次去除并打印
					while (list.size() > 0) {
						// 把当前的集合给清空了
						th_a_str_1 = list.remove(0);
						// 判断当前的字符串有没有一个字符
						if (th_a_str_1.equals("s")) {
							System.out.println("输入字符串结束");
							break;
						}
						// 输出字符串
						System.out.println("当前字符串" + th_a_str_1);
					}
					// 当线程B最后一次输入的字符符合要求的时候
					if (th_a_str_1.equals("s")) {
						break;
					}
					// 添加线程锁
					synchronized (this) {
						// 不仅要释放内存还要释放当前线程的同步锁(内存锁),线程会进入到休眠状态
						try {
							 wait(); //
						} catch (InterruptedException e) {
							 
						}
					}

				}
			}

		};
		// 启动线程
		th_a.start();
		// 线程B的创建(后台线程)
		Thread th_b = new Thread() {
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
					synchronized (th_a) {
						try {
						//明确指向唤醒是哪个线程
							th_a.notify();//唤醒哪个线程，就哪个线程的对象来调用notify()
						} catch (IllegalMonitorStateException e) {

						}

					}

				}
			}
		};
		// 把线程B设置为后台线程,如果说你把一个线程设置为守护线程，那么一定要在启动这个线程之前设置
		th_b.setDaemon(true);
		// 启动线程B
		th_b.start();
	}

}
