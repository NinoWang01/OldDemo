package com.pb.b;

import java.util.Scanner;

public class Test2 {
	public static double a;
	public static double b;
	public static String ss;

	public static void main(String[] args) {
		System.out.println("请输入第1个数据：");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		System.out.println("请输入第2个数据：");
		b = input.nextDouble();

		System.out.println("请输入运算符：");
		ss = input.next();

		hao();
	}

	public static void hao() {
		JiSuanQi jsq = new JiSuanQi();
		if (ss.equals("+")) {
			jsq.jia(a, b);
		}
		if (ss.equals("-")) {
			jsq.jian(a, b);
		}
		if (ss.equals("*")) {
			jsq.cheng(a, b);
		}
		if (ss.equals("/")) {
			jsq.chu(a, b);
		}
	}
}
