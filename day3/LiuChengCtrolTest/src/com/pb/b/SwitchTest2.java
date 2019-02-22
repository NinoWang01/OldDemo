package com.pb.b;

import java.util.Scanner;

public class SwitchTest2 {

	/*
	 * 小明这一周每天都干了什么 
	 * 星期一 ：跑步 
	 * 星期二 ：去钓鱼 
	 * 星期三 ：去游泳 
	 * 星期四 ：约妹子看电影 
	 * 星期五 ：相约一起LOL 
	 * 星期六 ：休息
	 * 星期日 ：睡觉
	 */
 

	public static String name="小明";
	public static void main(String[] args) {
		behavior();
	}

	public static void behavior() {
		System.out.println("请输入你想了解小明着这一周的那一天的情况：例如输入：星期一");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		// switch语句去匹配
		switch (str) {
		case "星期一":
		case "星期二":
			System.out.println("去钓鱼  ");
			break;
		case "星期三":
			System.out.println("去游泳 ");
			break;
		case "星期四":
			System.out.println("约妹子看电影  ");
			break;
		case "星期五":
			System.out.println("相约一起LOL ");
			break;
		case "星期六":
			System.out.println("休息");
			break;
		case "星期日":
			System.out.println("睡觉 ");
			break;
		default:
			break;
		}

	}

}
