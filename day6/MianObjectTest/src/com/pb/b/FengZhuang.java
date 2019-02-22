package com.pb.b;

public class FengZhuang {
	/*
	 * private ：它不能少，它用来私有化属性和方法
	 */
	private static String name;
	private int age;

	public FengZhuang() {

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		FengZhuang.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String hao() {
		return "woshi";
		//System.out.println("我是来自FengZhuang这个类的方法");
	}
}
