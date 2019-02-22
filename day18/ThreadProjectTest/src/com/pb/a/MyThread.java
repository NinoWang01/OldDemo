package com.pb.a;

/*
 * 创建线程的第一种方式，通过继承Thread
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		//事情的处理
		while(true){
			System.out.println("MyThread的run方法一直在执行");
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	

}
