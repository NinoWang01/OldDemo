package com.pb.a;

import java.util.Scanner;

public class Person {

	/*
	 * 普通的方法： name;//姓名 sex;//性别 age;//年龄 height;//身高 type;//性格
	 */
	public static String name;
	public static String sex;
	public static int age;
	public static double height;
	public static String type;
	// 今天午饭要吃的东西
	public static String food;

	public static void main(String[] args) {
		String str=new String();
		enterShuRu();
		// 方法eat而言，它就是一个携带参数的方法
		eat(name,type,age);//传进来三个实参。

//		study();
	}

	/*
	 *  对象的吃饭行为
	 *  str: 类似于一个叫占位符的东西
	 *  方法eat参数的个数，无限制  多个参数之间用“ , ”隔开
	 *  name，str，age：他们叫做形式参数，形参
	 */
	public static void eat(String name,String str, int age) {
		
		
		System.out.println(name + "年龄" + age + "一天要吃三餐" + "午饭吃了" + str);
	}

	// 对象的学习行为
	public static void study() {
		System.out.println(name + "年龄" + age + "每天都要学习程序开发");
	}

	// 接收键盘输入
	public static void enterShuRu() {
		// 请输入个人信息
		System.out.println("请输入个人信息:");
		Scanner input = new Scanner(System.in);
		System.out.println("输入名字：");
		name = input.next();
//		System.out.println("输入性别：");
//		sex = input.next();
		System.out.println("输入年龄：");
		age = input.nextInt();
//		System.out.println("输入身高：");
//		height = input.nextDouble();
		System.out.println("输入性格：");
		type = input.next();
		System.out.println("今天吃的午饭是：");
		food = input.next();
	}

}
