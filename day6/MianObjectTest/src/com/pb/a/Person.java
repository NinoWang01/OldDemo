package com.pb.a;

public class Person {
	public String name;
	public int age;
	public String sex;

	/*
	 * 静态代码块 有的应用程序：
	 */
	static {
		System.out.println("我是静态代码块,我要先执行，来自Person");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
	

}
