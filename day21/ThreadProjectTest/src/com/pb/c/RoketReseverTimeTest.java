package com.pb.c;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//火箭发射的倒计时
public class RoketReseverTimeTest {
	public static long minute;// 分钟
	public static long second;// 秒
	public static long fenmu = 60;
	public static void main(String[] args) {
		// 获得时间定时器对象
		Timer timer = new Timer();
		// 获取系统的当前时间
		long beginTime = System.currentTimeMillis();
		// 创建一个多少秒之后的一个时间点(结束时间点)
		long endTime = System.currentTimeMillis() + 6* 1000;
		// 创建一个日期对象
		Date date = new Date(endTime);
		// 设置一个任务，创建一个线程对象，作为倒计时用的线程对象,(计时，定时)
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				// 计算时间(多少秒之后发射)
				long leftTime = endTime - System.currentTimeMillis();
				// 分钟
				minute = leftTime / 1000 / fenmu;
				// 秒
				second = leftTime / 1000 % fenmu;
				// 输出时间
				System.out.println(minute + "分" + ":" + second + "秒");
			}
		}, 0, 1000);
		// 任务二，发射火箭
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("发射火箭");
				// 清除所有的任务
				timer.cancel();
			}
		}, date);

	}

}
