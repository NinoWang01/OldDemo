package com.pb.b;

import java.util.Scanner;

public class IoThreadTest {
	public static boolean isright = true;
	public static Thread dd;
	public static void main(String[] args) {
		// 创建一个异常对象
		Thread th = new Thread() {
			@Override
			public void run() {
				while (isright) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// 当线程配重新叫醒的时候
						System.out.println("线程被叫醒了");
						// 循环终断了
						isright = false;
					}
				}
			}
		};
		// 启动线程
		th.start();
		// 创建一个新的线程
		dd = new Thread() {
			@Override
			public void run() {
				// 接收键盘的输入,产生IO  
				System.out.println("请随便输入一点内容");
				Scanner input = new Scanner(System.in);
				String s = input.next(); // 线程被阻塞了
				if (dd.isInterrupted()) {
					System.out.println("当前线程被阻塞停止，被叫醒");
				} else {
					System.out.println("当前线程被阻塞了");
				}
				// 叫醒线程
				th.interrupt();
			}
		};
		dd.start();
	}
}
