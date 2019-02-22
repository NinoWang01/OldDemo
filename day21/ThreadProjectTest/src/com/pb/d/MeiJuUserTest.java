package com.pb.d;

import java.util.Scanner;

public class MeiJuUserTest {

	public static void main(String[] args) {

		MeiJuUser user;
		System.out.println("从键盘输入1~4");
		Scanner input = new Scanner(System.in);
		// 选择春夏-秋冬
		System.out.println("1-春、2-夏、3-秋、4-冬");
		// 声明一个变量接收
		int a = input.nextInt();
		// 将输入的数字转换为枚举值
		user = MeiJuUser.values()[a - 1];
		switch (user) {
		case SPRING:
			System.out.println("春眠不觉晓，处处闻啼鸟");
			break;
		case SUMMER:
			System.out.println("接天莲叶无穷碧，映日荷花别样红");
			break;
		case AUTUMU:
			System.out.println("停车坐爱枫林晚，霜叶红于二月花");
			break;
		case WINTER:
			System.out.println("忽如一夜春风来，千树万树梨花开");
			break;
		default:
			break;
		}

	}

}
