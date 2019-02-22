package com.pb.b;

public class PersonTest {

	public static int a = 1;
	public static double b = 2;

	public static void main(String[] args) {
		Person p = new Person("", 23);
		// jiSuan();
		double c = 0;
		c = a + b;
		System.out.println(c);

	}

	// 局部变量只能在声明它的局部使用，出了局部，没有任何意义
	public static void jiSuan() {
		double c = 0;
		double a = 3;
		double b = 4;
		c = a + b;
		c = PersonTest.a + PersonTest.b;
		System.out.println(c);

	}

}
