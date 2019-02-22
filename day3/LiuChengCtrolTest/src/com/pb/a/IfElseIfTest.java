package com.pb.a;

import java.util.Scanner;

public class IfElseIfTest {

	/*
	 * if（条件）{代码块} else if（条件）{代码块} else{代码块}
	 */

	public static double score_ZS = 79;
	public static double score_LS = 90;

	public static void main(String[] args) {
		System.out.println("请输入两个学生的成绩：");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入张三成绩：");
		score_ZS = input.nextDouble();
		System.out.println("请输入李四成绩：");
		score_LS = input.nextDouble();
		//比较张三和李四的成绩分属那个阶段
		if (score_ZS > score_LS && score_ZS >= 90 && score_ZS <= 100) {
			System.out.println("张三为优秀学生");
		} else if (score_ZS > score_LS && score_ZS >= 80 && score_ZS < 90) {
			System.out.println("张三为中等学生");
		} else if (score_ZS < score_LS && score_LS >= 90 && score_LS <= 100) {
			System.out.println("李四为优秀学生");
		} else if (score_ZS < score_LS && score_LS >= 80 && score_LS < 90) {
			System.out.println("李四为中等学生");
		} else if (score_ZS == score_LS && score_LS >= 90 && score_LS <= 100) {
			System.out.println("张三和李四都为优秀学生");
		} else if (score_ZS == score_LS && score_LS >= 80 && score_LS < 90) {
			System.out.println("张三和李四都为中等学生");
		}
		// 张三和李四的成绩都低于60
		else {

			if (score_ZS < 60 && score_ZS >= 0) {
				System.out.println("张三为差等学生");
			}
			//当if的条件不成立的时候，继续往下判断 else if  
			else if (score_LS < 60 && score_LS >= 0) {
				System.out.println("李四为差等学生");
			}
			else if (score_ZS == score_LS && score_ZS < 60 && score_LS < 60
					&& score_ZS >= 0 && score_LS >= 0) {
				System.out.println("张三和李四都为差等学生");
			}
			else if(score_ZS < 60 && score_LS < 60
					&& score_ZS >= 0 && score_LS >= 0){
				System.out.println("张三和李四都为差等学生");
			}
			else{
				
			}

		}

	}

}
