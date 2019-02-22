package com.pb.c;

import java.util.Scanner;

public class Test6 {
	public static int a = 2;
	public static int b = 3;
	public static int c = 1;
	public static int d = 4;
	public static int e = 30;
	public static int sum = 20;

	// += -= ( ) : ? << >>
	public static void main(String[] args) {
		// qiuHe();

		System.out.println();
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
	}

	public static void qiuHe() {
		for (int i = 0; i < 10; i++) {
			// sum += a;
			sum -= a;
			// sum=sum+a;
		}
		System.out.println(sum);
	}

	/*
	 * 
	 * 利用学过的运算符，写一个计算器 所有的数据从键盘上输入
	 */

}
