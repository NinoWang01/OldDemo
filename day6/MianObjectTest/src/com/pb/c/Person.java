package com.pb.c;

public class Person {

	public String name;
	public int age;
	public String sex;

	// 创建单例的时候用到的
	public Person(String name) {
		this.name = name;
	}

	// 它不是构造方法
	public void person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// 父类的公有的方法
	public void publicTest() {

	}

	public int hao() {
		return age;
	}

	public void hao(int a) {

	}

	public int hao(String b,int a) {
		return age;
	}
	public int hao(int a,String b) {
		return age;
	}
}
