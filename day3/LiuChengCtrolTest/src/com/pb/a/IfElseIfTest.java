package com.pb.a;

import java.util.Scanner;

public class IfElseIfTest {

	/*
	 * if��������{�����} else if��������{�����} else{�����}
	 */

	public static double score_ZS = 79;
	public static double score_LS = 90;

	public static void main(String[] args) {
		System.out.println("����������ѧ���ĳɼ���");
		Scanner input = new Scanner(System.in);
		System.out.println("�����������ɼ���");
		score_ZS = input.nextDouble();
		System.out.println("���������ĳɼ���");
		score_LS = input.nextDouble();
		//�Ƚ����������ĵĳɼ������Ǹ��׶�
		if (score_ZS > score_LS && score_ZS >= 90 && score_ZS <= 100) {
			System.out.println("����Ϊ����ѧ��");
		} else if (score_ZS > score_LS && score_ZS >= 80 && score_ZS < 90) {
			System.out.println("����Ϊ�е�ѧ��");
		} else if (score_ZS < score_LS && score_LS >= 90 && score_LS <= 100) {
			System.out.println("����Ϊ����ѧ��");
		} else if (score_ZS < score_LS && score_LS >= 80 && score_LS < 90) {
			System.out.println("����Ϊ�е�ѧ��");
		} else if (score_ZS == score_LS && score_LS >= 90 && score_LS <= 100) {
			System.out.println("���������Ķ�Ϊ����ѧ��");
		} else if (score_ZS == score_LS && score_LS >= 80 && score_LS < 90) {
			System.out.println("���������Ķ�Ϊ�е�ѧ��");
		}
		// ���������ĵĳɼ�������60
		else {

			if (score_ZS < 60 && score_ZS >= 0) {
				System.out.println("����Ϊ���ѧ��");
			}
			//��if��������������ʱ�򣬼��������ж� else if  
			else if (score_LS < 60 && score_LS >= 0) {
				System.out.println("����Ϊ���ѧ��");
			}
			else if (score_ZS == score_LS && score_ZS < 60 && score_LS < 60
					&& score_ZS >= 0 && score_LS >= 0) {
				System.out.println("���������Ķ�Ϊ���ѧ��");
			}
			else if(score_ZS < 60 && score_LS < 60
					&& score_ZS >= 0 && score_LS >= 0){
				System.out.println("���������Ķ�Ϊ���ѧ��");
			}
			else{
				
			}

		}

	}

}
