package com.pb.c;

public class Person {

	public String name;
	public int age;
	public String sex;

	// ����������ʱ���õ���
	public Person(String name) {
		this.name = name;
	}

	// �����ǹ��췽��
	public void person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// ����Ĺ��еķ���
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
