package com.pb.b;

import java.util.Scanner;

public class Test {
	public static final int CHANGE_INTENTER=1;
	
	
	
	
	public static void main(String[] args) {
		System.out.println("请选择：1、衣服 2、鞋子、3、帽子");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();

		switch (key) {
		case 1:
			System.out.println("小明要买衣服");
			break;
		case 2:
			System.out.println("小明要买鞋子");
			break;
		case 3:
			System.out.println("小明要买帽子");
			break;
		default:
			break;
		}
	}
}
