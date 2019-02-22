package com.pb.a;

public class Cat {
	public static void main(String[] args) {
		/*
		 * 创建对象的方式new Animal()；只要你创建一个类，那么JVM
		 * 就会默认，给这个类创建一个无参数构造方法（即构造器） 
		 * 
		 * 构造方法的作用：对象实例化
		 * 
		 * 说：一旦在类中有了有参数的构造方法后，那么再去实例化这个类的
		 * 实例的时候，就不能在使用无参的构造方法，（本质是：无参数的
		 * 构造方法，被JVM给收回去了）
		 */
		Animal a = new Animal("");

	}
}
