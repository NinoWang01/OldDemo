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

	// ���췽��

	public void hao() {
		System.out.println("���Ǹ���Animal�еķ���");
	}

}
