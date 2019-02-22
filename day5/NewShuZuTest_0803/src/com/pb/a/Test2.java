package com.pb.a;

import java.util.Scanner;

public class Test2 {
	
	public static String name;
	public static String sex;
	public static int age;
	public static double height;
	public static String type;
	// 今天午饭要吃的东西
	public static String food;

	public static void main(String[] args) {
		
		System.out.println(backHeight());//输出

	}

	/*
	 * 1、普通方法
	 * 2、带有参数的方法
	 * 3、带有参数和返回数据类型的方法，能够处理更加复杂化的需求
	 * 
	 */
	public static void eat(String name, String str, int age) {

		System.out.println(name + "年龄" + age + "一天要吃三餐" + "午饭吃了" + str);
	}

	public static void enterShuRu() {
		// 请输入个人信息
		System.out.println("请输入个人信息:");
		Scanner input = new Scanner(System.in);
		System.out.println("输入名字：");
		name = input.next();
		// System.out.println("输入性别：");
		// sex = input.next();
		System.out.println("输入年龄：");
		age = input.nextInt();
		// System.out.println("输入身高：");
		// height = input.nextDouble();
		System.out.println("输入性格：");
		type = input.next();
		System.out.println("今天吃的午饭是：");
		food = input.next();
	}
	
	/*
	 * 带有返回类型的方法
	 * double：返回类型是double
	 * 在方法体里边必须要有一个 return 
	 * 不常见的带有返回类型的方法，返回的数据类型，①、类（Android中常见），②、集合（Android中常见）、③、对象实例（Android中常见）
	 */
	public static double backHeight(){
		
		return 0.0;
	}
	
	
	
	
	/*
	 * 
	 * 
	 * 写计算器，从键盘输入
	 * 	double  add(double d1, double d2){
	 * 
					return d1+d2;
					
			}
	 */
	
	
	
	
	
	
	
	
	
	
	
}
