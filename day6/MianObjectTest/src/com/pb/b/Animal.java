package com.pb.b;

public class Animal {

	public String name;
	public int age;
	public String sex;
	public String kind;

	public Animal(String name, String kind) {
		this.kind = kind;
		this.name = name;
	}

	// 构造方法

	public void hao() {
		System.out.println("我是父类Animal中的方法");
	}

}
