package com.pb.a;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seacher() {
		 System.out.println("���Ǽ̳��˳�����Person�����࣬λ��seacher()���������");

	}

	@Override
	public void sleep() {
		 System.out.println("���Ǽ̳��˳�����Person�����࣬λ��sleep()���������");

	}

}
