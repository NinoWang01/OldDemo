package com.pb.a;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seacher() {
		 System.out.println("我是继承了抽象类Person的子类，位于seacher()这个方法中");

	}

	@Override
	public void sleep() {
		 System.out.println("我是继承了抽象类Person的子类，位于sleep()这个方法中");

	}

}
