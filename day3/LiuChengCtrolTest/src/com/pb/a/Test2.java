package com.pb.a;

import java.util.Scanner;

public class Test2 {
	/*
	 * 1���õ�һ����� 2������ݽ��������жϡ�if��������{�����} else if��������{�����} else{�����} 3���ó��������ӡ���
	 */
	public static int year;

	public static void main(String[] args) {
		// �Ӽ���������һ�����
		System.out.println("��������ݣ�");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();

		// �ж���ݺϲ�����,
		if (year > 1970 && year < 2017) {
			// ��������ж�
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + "������");
			} else {
				System.out.println(year + "��ƽ��");
			}

		} else if (year < 1970) {
			System.out.println("ʱ�䲻�ܱ����ʱ��㿿ǰ��");
		} else if (year > 2017) {
			System.out.println("ʱ�䲻�ܱ����ʱ��㿿��");
		} else {
			System.out.println("�������ݲ�������������������ݣ�");
		}

	}

}
