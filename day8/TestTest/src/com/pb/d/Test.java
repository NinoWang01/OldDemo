package com.pb.d;

public class Test {

	public static void main(String[] args) {

		/*
		 * 匿名内部类:匿名的是应用变量名 重写自身的方法，只要是匿名内部类，都可以去重写自身的方法
		 */
		new HelloTest() {
			@Override
			public void huai() {
				// super.huai();
				System.out.println("我是测试类中的huai()方法");
			}
		}.huai();
		new HelloTest().huai();
		
		
		
		

	}
}
