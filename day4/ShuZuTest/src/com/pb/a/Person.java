package com.pb.a;


//一个类可以直接调用自身的属性和方法
public class Person {
	/*
	 * private:是修饰属性和方法的，只不过，
	 * 被它修饰的都是私有的，除了自身，别人无法操作
	 */
	String name;// 姓名,是不是一个变量
	char sex;// 性别
	int age;// 年龄
	double height;// 身高
	String type;// 性格
	
	
	
	//获得 setName赋的值
	public String getName() {
		return name;
	}
	//这个方法是给name赋值的
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//吃饭的方法
	public void eat(String s){
		System.out.println("你吃饭了没？");
	}
	
	
	
	
	
	
	
	

}
