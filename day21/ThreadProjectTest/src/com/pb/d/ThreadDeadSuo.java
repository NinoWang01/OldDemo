package com.pb.d;

public class ThreadDeadSuo implements Runnable {
	// 创建两个锁对象
	public Object obj01 = new Object();
	public Object obj02 = new Object();
	// 标记
	public boolean flag;
	// 创建一个构造方法
	public ThreadDeadSuo(boolean flag) {
		this.flag = flag;
	}
	/*
	 * 都需要对方释放掉内存和线程锁
	 */
	@Override
	public void run() { 
		// 模仿死锁
		if (flag) {
			while (true) {
				synchronized (obj01) {
					System.out.println("if===========obj01");
					// 得到obj02的锁
					synchronized (obj02) {
						System.out.println("if========obj02");
					}
				}
			}
		} else {
			while (true) {
				synchronized (obj02) {
					System.out.println("if===========obj02");
					// 得到obj02的锁
					synchronized (obj01) {
						System.out.println("if========obj01");
					}
				}
			}

		}

	}

}
