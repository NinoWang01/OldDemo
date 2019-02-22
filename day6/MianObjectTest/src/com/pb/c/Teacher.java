package com.pb.c;

public class Teacher extends Person {

	public Teacher(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publicTest() {
		// TODO Auto-generated method stub
		System.out.println("教师每天都要上课");
		System.out.println("姓名：" + super.name + "年龄：" + super.age + "性别："
				+ super.sex);
	}

}
