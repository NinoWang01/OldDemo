package com.pb.c;

public class Worker extends Person {

	public Worker(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publicTest() {
		// TODO Auto-generated method stub
		System.out.println("供热内天都要上班");
		System.out.println("姓名：" + super.name + "年龄：" + super.age + "性别："
				+ super.sex);
	}

}
