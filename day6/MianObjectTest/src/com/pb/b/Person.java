package com.pb.b;

public class Person {

	/*
	 * ， 全局变量：变量位于类中，其次变量也不再方法当中、也静态代码块当中 ，一般都是全局变量，如下：使用范围是在整个类的任何位置，被static
	 * 修饰的方法或代码块，如果想使用全局变量，那么这个变量必须得是静态。
	 */
	public static String name;
	public int age;
	public String sex;

	/*
	 * 构造方法的参数：name、age 他们俩是局部变量 局部变量：指的是定义在方法当中，或者局部代码块当中的变量
	 */

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void hao() {
		// 局部变量，位于hao()方法中
		String name = "张无忌";

		System.out.println(this.name);
		System.out.println(name);

	}

}
