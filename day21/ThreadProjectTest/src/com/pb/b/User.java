package com.pb.b;

//实现了Runnable一个线程类s
public class User implements Runnable {
	// 给user添加一个元素
	String[] sss = { 
			"俺是一个小小鸟",
			"怎么飞也飞不高",
			"寻寻觅觅寻找一个温暖的怀抱",
			"这样的要求会不会太高" };
	int a = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println("实现了Runnable的User");
			// 打印线程对象的一些属性信息
			System.out.println(Thread.currentThread().getName() + ":"
					+ sss[a++ % 4]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
