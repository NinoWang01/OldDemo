package com.pb.c;

import java.util.Scanner;

public class ForTest {
	/*
	 * for(int i=1;i<=20;i++){
				System.out.println("上课迟到，罚做俯卧撑"+i+"次");
			}
		(int i=1;i<=20;i++):（）有三个表达式
		int i=1; ：for循环循环变量
		i<=20;  ： for循环循环变条件
		i++     ：for循环循环变量值的改变，从而推动for循环的继续
	 */
	public static int a;
	public static int b;
	public static int c;
	public static void main(String[] args) {

		for(int i=1;i<=10;i++){
			System.out.println("第"+i+"次使用计算器：");
			System.out.println("请输入两个数：");
			// 导入包的快捷键:Ctrl+Shift+o
			Scanner input = new Scanner(System.in);
			System.out.println("请输第一个数：");
			a = input.nextInt();
			System.out.println("请输第二个数：");
			b = input.nextInt();
			System.out.println("请输入一个运算符：");
			String s = input.next();
			jiSuanQi(a, b, s);
		}
	}
	
	public static void jiSuanQi(int a, int b, String str) {
		if (str.equals("+")) {
			c = a + b;
			System.out.println(c);
		}
		if (str.equals("-")) {
			c = a - b;
			System.out.println(c);
		}
		if (str.equals("*")) {
			c = a * b;
			System.out.println(c);
		}
		if (str.equals("/")) {
			if (b != 0) {
				c = a / b;
				System.out.println(c);
			} else {
				System.out.println("分母不能为零");
			}

		}

	}
	
	
	
	
	
	
}
