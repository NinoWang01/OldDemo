package com.pb.a;

public class NewThreadTest {
	public static void main(String[] args) {
		NewThread newThread = new NewThread();
		// 把newThread
		Thread thread = new Thread(newThread);
		thread.start();
		while (true) {
			System.out.println("main方法在执行");
		}

	}
}
