package com.pb.b;

import java.util.Scanner;

public class SwitchTest {
	/*
	 * //���ʽ��ֵ�� �����ǣ�int ��byte��char��short��String ����JDK7.0֮�������ӵ�
	 * 
	 * switch����ʽ�{
	 * 
	 * case Ŀ��ֵ1�� ����飻 break�� default�� ����飻 break��
	 *  Ŀ��ֵ:���������͡�����ʹ�ַ���������ʹ���ʽ��ֵΪ���ͣ�
	 * 
	 * }
	 */
	public static double score;

	public static void main(String[] args) {
		checkScore();
	}

	public static void checkScore() {
		// ��ü����������
		System.out.println("���������");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		// ��switch�ṹ�ж� ��ݼ� sw_Alt+/ �ٻس�
		System.out
				.println("������Ҫ��ѯ�ɼ���ѡ��ѯ�׶��У�1��90~100��2��80~90������90����3��70~80������80����4��60~70������70����5��60����");
		int a = input.nextInt();
		switch (a) {
		/*
		 * 90~100:���� 1 80~90������ 2 70~80���е� 3 60~70������ 4 60���£������񣨲 5
		 */
		case 1:// �ж�����
			if (score >= 90 && score <= 100) {
				System.out.println("�óɼ�Ϊ����");
			}
			break;
		case 2:// �ж�����
			if (score >= 80 && score < 90) {
				System.out.println("�óɼ�Ϊ����");
			}
			break;
		case 3:// �ж��е�
			if (score >= 70 && score < 80) {
				System.out.println("�óɼ�Ϊ�е�");
			}
			break;
		case 4:// �жϼ���
			if (score >= 60 && score < 70) {
				System.out.println("�óɼ�Ϊ����");
			}
			break;
		case 5:// �жϲ�
			if (score >= 0 && score < 60) {
				System.out.println("�óɼ�Ϊ��");
			}
			break;
		// ����������case��û��ƥ��ɹ���ʱ�򣬾�ִ��default
		default:
			if (score > 100) {
				System.out.println("�û�����ĳɼ�������������0~100�ĳɼ�������");
			} else {
				if (score < 0) {
					System.out.println("�ɼ�����Ϊ������");
				}

				break;
			}

		}
	}
}
