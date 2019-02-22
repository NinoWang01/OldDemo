package com.pb.a;

import java.util.Scanner;

public class Test3 {
	static	String name="张三";
	static String sex="男";

	public static double a, b;

	/*
	 * 访问修饰符：
	 * 1、public ：可以用来修饰属性、方法、或者类  
	 *             权限：
	 * 2、private ： 私有的，可以用来修饰属性、方法、或者类
	 *             权限：
	 * 3、default:  可以用来修饰属性、方法、或者类 
	 *             权限： 
	 * 4、protecded : 可以用来修饰属性、方法、或者类
	 *             权限
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
//		shuRu();
//		JiSuan(a, b);
		System.out.println(name+"\t"+sex);
		
//		System.out.println(JiSuan(a, b));
	}

	// 键盘输入
	  static void shuRu() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入:");
		a = input.nextDouble();
		System.out.println();
		b = input.nextDouble();

	}

	// 计算,
	public static double JiSuan(double a, double b) {
		return a + b;
	}

}
