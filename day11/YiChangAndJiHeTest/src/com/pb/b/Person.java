package com.pb.b;

public class Person {
	private int age;
	public String name;
	public String sexx;

	public Person() {

	}

	public Person(int age, String name, String sexx) {
		this.age = age;
		this.name = name;
		this.sexx = sexx;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexx() {
		return sexx;
	}

	public void setSexx(String sexx) {
		this.sexx = sexx;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "年龄：" + this.age + "\t" + "姓名：" + this.name + "\t" + "性别："
				+ this.sexx;
	}

}
