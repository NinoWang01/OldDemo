package com.pb.b;

public class Person {
	public int age;
	public Person(){
		super();
	}

	@Override
	protected void finalize() throws Throwable {
 
		System.out.println("����һ������������Ҫ����");
	}
}
