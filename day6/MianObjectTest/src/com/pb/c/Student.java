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

	// ѧ������Ϊ
	@Override
	public void publicTest() {
		System.out.println("ѧ��ÿ�춼Ҫѧϰ");
		System.out.println("������" + super.name + "���䣺" + super.age + "�Ա�"
				+ super.sex+"�ص㣺"+this.teDian);
	}
	
	
	

}
