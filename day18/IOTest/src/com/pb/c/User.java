package com.pb.c;

import java.io.Serializable;

/*
 * 实例化一个例对象
 * 通过关键字implements实现接口Serializable，能够达到对一个类进行序列化
 */
@SuppressWarnings("serial")
public class User implements Serializable{
	public int age;
	public String name;
	public String sex;
	public User(int age, String name, String sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
