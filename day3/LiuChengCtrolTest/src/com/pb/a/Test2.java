package com.pb.a;

import java.util.Scanner;

public class Test2 {
	/*
	 * 1、得到一个年份 2、拿年份进行条件判断、if（条件）{代码块} else if（条件）{代码块} else{代码块} 3、得出结果，打印输出
	 */
	public static int year;

	public static void main(String[] args) {
		// 从键盘上输入一个年份
		System.out.println("请输入年份：");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();

		// 判断年份合不合理,
		if (year > 1970 && year < 2017) {
			// 闰年年份判断
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + "是闰年");
			} else {
				System.out.println(year + "是平年");
			}

		} else if (year < 1970) {
			System.out.println("时间不能比这个时间点靠前：");
		} else if (year > 2017) {
			System.out.println("时间不能比这个时间点靠后：");
		} else {
			System.out.println("输入的年份不合理，重新输入整数年份：");
		}

	}

}
