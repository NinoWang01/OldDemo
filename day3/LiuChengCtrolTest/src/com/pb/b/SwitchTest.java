package com.pb.b;

import java.util.Scanner;

public class SwitchTest {
	/*
	 * //表达式的值： 可以是：int 、byte、char、short、String 类型JDK7.0之后新增加的
	 * 
	 * switch（表式达）{
	 * 
	 * case 目标值1： 代码块； break； default： 代码块； break；
	 *  目标值:可以是整型、可以使字符串、可以使表达式（值为整型）
	 * 
	 * }
	 */
	public static double score;

	public static void main(String[] args) {
		checkScore();
	}

	public static void checkScore() {
		// 获得键盘输入分数
		System.out.println("输入分数：");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		// 用switch结构判断 快捷键 sw_Alt+/ 再回车
		System.out
				.println("输入你要查询成绩可选查询阶段有：1、90~100；2、80~90（不含90）；3、70~80（不含80）、4、60~70（不含70）；5、60以下");
		int a = input.nextInt();
		switch (a) {
		/*
		 * 90~100:优秀 1 80~90：良好 2 70~80：中等 3 60~70：及格 4 60以下：不及格（差） 5
		 */
		case 1:// 判断优秀
			if (score >= 90 && score <= 100) {
				System.out.println("该成绩为优秀");
			}
			break;
		case 2:// 判断良好
			if (score >= 80 && score < 90) {
				System.out.println("该成绩为良好");
			}
			break;
		case 3:// 判断中等
			if (score >= 70 && score < 80) {
				System.out.println("该成绩为中等");
			}
			break;
		case 4:// 判断及格
			if (score >= 60 && score < 70) {
				System.out.println("该成绩为及格");
			}
			break;
		case 5:// 判断差
			if (score >= 0 && score < 60) {
				System.out.println("该成绩为差");
			}
			break;
		// 当以上所有case都没有匹配成功的时候，就执行default
		default:
			if (score > 100) {
				System.out.println("用户输入的成绩不合理，请输入0~100的成绩分数：");
			} else {
				if (score < 0) {
					System.out.println("成绩不能为负数：");
				}

				break;
			}

		}
	}
}
