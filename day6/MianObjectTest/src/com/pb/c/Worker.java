package com.pb.c;

public class Worker extends Person {

	public Worker(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publicTest() {
		// TODO Auto-generated method stub
		System.out.println("�������춼Ҫ�ϰ�");
		System.out.println("������" + super.name + "���䣺" + super.age + "�Ա�"
				+ super.sex);
	}

}
