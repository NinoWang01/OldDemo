package com.pb.c;

public final class FinalTest {
	/*
	 * final: 
	 * 1、当一个变量用final来修饰的时候，那么这个变量 就变成了常量，
	 * 2、final 修饰的方法，在其子类中不能够被重写
	 * 3、用final修饰的类不能被继承
	 * 4、
	 */
	public final static int A = 1;// 通过final关键字改变成静态的常量

	// 这个方法就讲不会被重写
	public final void hao() {

	}

	public void huai() {

	}

}
