package com.pb.c;

public class Teacher extends Person {

	public Teacher(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publicTest() {
		// TODO Auto-generated method stub
		System.out.println("��ʦÿ�춼Ҫ�Ͽ�");
		System.out.println("������" + super.name + "���䣺" + super.age + "�Ա�"
				+ super.sex);
	}

}
