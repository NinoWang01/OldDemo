package com.pb.c;

import java.util.Timer;
import java.util.TimerTask;
//用定时器写线程
public class DingTimeTest {
	public static void main(String[] args) {
		// 创建一个线程类对象
		final Thread th = new Thread() {
			@Override
			public void run() {
				// 输出一条语句，然后休眠一下
				System.out.println("34634675678");
				try {
					// 休眠
					Thread.sleep(1000*60);
				} catch (InterruptedException e) {
					//其实本意是走这一句
					System.out.println("被唤醒的时候走这个输出语句");
				}
			}
		};
		// 启动了当前的线程
		th.start();
		// 定时器对象
		final Timer timer = new Timer();
		// 设置任务计划，什么时间执行它的run（）方法
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				// 把当前休眠的线程给唤醒
				th.interrupt();
//				// 清除当前的任务
				timer.cancel();
//				System.out.println("sdfgjfgk");
			}
		}, 5000);

	}

}
