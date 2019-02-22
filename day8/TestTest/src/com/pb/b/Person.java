package com.pb.b;

public class Person {
	public int age;
	public Person(){
		super();
	}

	@Override
	protected void finalize() throws Throwable {
 
		System.out.println("这是一个垃圾对象，需要回收");
	}
}
