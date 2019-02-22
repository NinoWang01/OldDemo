package com.pb.a;

public class Bird {
	public String name;
	public int age;
	public String sex;
	public String PersnalSkill;

	/*
	 * 构造方法 构造方法可以调用构造方法 通过this关键字
	 */
	public Bird() {
		super();// 调用了父类的无参的构造方法
	}

	public Bird(String name) {
		this();// 调用了本类的无参数的构造方法
		// 同过this关键字
		this.name = name;
	}

	public Bird(String name, int age) {
		this(name);// 调用了本类的无参数的构造方法
		// 同过this关键字
		this.age = age;
	}

	public Bird(int age, String name) {
		this(name);// 调用了本类的无参数的构造方法
		// 同过this关键字
		this.age = age;
	}

	public Bird(String name, int age, String sex) {
		this(name, age);
		// 同过this关键字
		this.sex = sex;
	}

	public Bird(String name, int age, String sex, String PersnalSkill) {
		this(name, age, sex);
		// 同过this关键字
		this.PersnalSkill = PersnalSkill;
	}

	public void hao() {
		System.out.println("我是一个Bird类的一个普通方法");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hao1() {

	}
	public int hao1(String s, int a) {
		
		return a;
	}

}
