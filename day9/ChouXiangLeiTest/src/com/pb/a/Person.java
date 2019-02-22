package com.pb.a;

public abstract class Person {

	public int age;
	public String name;
	public String number;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	
	public abstract void seacher();
	public abstract void sleep();

	public void hao(){
		System.out.println("我是抽象类中的普通方法");
	}
	
	
	
	 
}
