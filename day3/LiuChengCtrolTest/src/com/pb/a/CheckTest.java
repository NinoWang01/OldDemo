package com.pb.a;

import java.util.Scanner;

public class CheckTest {
	// ѧ���ĳɼ�
	public static double score;

	public static void main(String[] args) {
		checkScore();
	}

	/*
	 * 90~100:���� 
	 * 80~90������ 
	 * 70~80���е� 
	 * 60~70������ 
	 * 60���£������񣨲
	 */
	public static void checkScore() {
		// �Ȼ�ȡ�ɼ�score
		System.out.println("������ѧ���ĳɼ���");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		// �жϸóɼ����Ǹ��׶�
		if (score >= 90 && score <= 100) {
			System.out.println("�óɼ�Ϊ����");
		}
		if (score >= 80 && score < 90) {
			System.out.println("�óɼ�Ϊ����");
		}
		if (score >= 70 && score < 80) {
			System.out.println("�óɼ�Ϊ�е�");
		}
		if (score >= 60 && score < 70) {
			System.out.println("�óɼ�Ϊ����");
		}
		if (score>=0&&score < 60) {
			System.out.println("�óɼ�Ϊ��");
		} else {
			if (score > 100) {
				System.out.println("�û�����ĳɼ�������������0~100�ĳɼ�������");
			}else{
				if(score<0){
					System.out.println("�ɼ�����Ϊ������");
				}
			}

		}

	}

}
