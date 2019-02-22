package com.pb.a;

import java.util.Scanner;

public class CheckTest {
	// 学生的成绩
	public static double score;

	public static void main(String[] args) {
		checkScore();
	}

	/*
	 * 90~100:优秀 
	 * 80~90：良好 
	 * 70~80：中等 
	 * 60~70：及格 
	 * 60以下：不及格（差）
	 */
	public static void checkScore() {
		// 先获取成绩score
		System.out.println("请输入学生的成绩：");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		// 判断该成绩在那个阶段
		if (score >= 90 && score <= 100) {
			System.out.println("该成绩为优秀");
		}
		if (score >= 80 && score < 90) {
			System.out.println("该成绩为良好");
		}
		if (score >= 70 && score < 80) {
			System.out.println("该成绩为中等");
		}
		if (score >= 60 && score < 70) {
			System.out.println("该成绩为及格");
		}
		if (score>=0&&score < 60) {
			System.out.println("该成绩为差");
		} else {
			if (score > 100) {
				System.out.println("用户输入的成绩不合理，请输入0~100的成绩分数：");
			}else{
				if(score<0){
					System.out.println("成绩不能为负数：");
				}
			}

		}

	}

}
