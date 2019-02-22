package com.pb.c;

public class Test3 {
	public static void main(String[] args) {
		//创建了这么一个对象时候
		Person p1=new Person();
		Person<Integer> p = new Person<Integer>();
		p.age=23;
//		p.save(age);
		System.out.println(p.get());

	}

}
