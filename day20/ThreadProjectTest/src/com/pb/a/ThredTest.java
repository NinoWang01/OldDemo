package com.pb.a;

public class ThredTest {

	// main主线程（当进入到这个程序的时候运行的是main方法）
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		myThread.run();
		
		//在主线程中再来一个死循环
		while(true){
			System.out.println("main方法一直在运行");
		}
	}
}
// 自定义一个线程,单线程执行的方式
class MyThread11{
	// 写一个run
	public void run() {
		// 写个死循环
		while (true) {
			System.out.println("MyThread的run方法一直在执行");
		}
	}

}