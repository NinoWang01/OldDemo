package com.pb.d;

public class ThreadRangBu extends Thread {

	public ThreadRangBu(String name) {
		super(name);
	}

	@Override
	public void run() {
		// 线程的让步
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName() + ":" + i);
			// 如果当i==x的时候，让线程让步
			if (i == 5) {
				System.out.println("线程让步");
				Thread.yield();//对线程做了一个短暂休眠
				
				//如果说当线程让步（让的是当前计算机的资源）的时候，做了新的事情
				
				
			}

		}

	}

}
