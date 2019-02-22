package com.pb.a;

import java.util.Scanner;

public class IfTest {

	public static String name = "张三";
	public static int number = 2016072920;

	public static void main(String[] args) {

		/*
		 * if（条件）{代码块} ():它当中的条件决定了{}当中的代码块会不会被执行 代码块:做业务逻辑处理check();
		 */
		System.out.println("请输入查询学生基本信息：");
		Scanner input = new Scanner(System.in);

		String ss = input.next();
		int aa = input.nextInt();
		//if (条件){代码块A}的条件成立，代码块A执行，如果不成立，执行else{代码块B}当中的代码块B
		if (ss.equals(name) && number == aa) {
			// 调用查询的方法
			check();
		}else{
			//处理的是输入查询信息不符合查询要求
			System.out.println("查询信息不符合查询要求，重新输入：");
		}

	}

	public static void check() {

		System.out.println("姓名：" + name + "\t" + "学号：" + number);

	}
}
