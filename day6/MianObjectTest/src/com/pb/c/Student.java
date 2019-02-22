package com.pb.c;

public class Student extends Person {

	public String teDian;

	public String getTeDian() {
		return teDian;
	}

	public void setTeDian(String teDian) {
		this.teDian = teDian;
	}

	public Student(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	// 学生的行为
	@Override
	public void publicTest() {
		System.out.println("学生每天都要学习");
		System.out.println("姓名：" + super.name + "年龄：" + super.age + "性别："
				+ super.sex+"特点："+this.teDian);
	}
	
	
	

}
