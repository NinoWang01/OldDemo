package com.pb.a;

import java.util.Scanner;

public class IfTest {

	public static String name = "����";
	public static int number = 2016072920;

	public static void main(String[] args) {

		/*
		 * if��������{�����} ():�����е�����������{}���еĴ����᲻�ᱻִ�� �����:��ҵ���߼�����check();
		 */
		System.out.println("�������ѯѧ��������Ϣ��");
		Scanner input = new Scanner(System.in);

		String ss = input.next();
		int aa = input.nextInt();
		//if (����){�����A}�����������������Aִ�У������������ִ��else{�����B}���еĴ����B
		if (ss.equals(name) && number == aa) {
			// ���ò�ѯ�ķ���
			check();
		}else{
			//������������ѯ��Ϣ�����ϲ�ѯҪ��
			System.out.println("��ѯ��Ϣ�����ϲ�ѯҪ���������룺");
		}

	}

	public static void check() {

		System.out.println("������" + name + "\t" + "ѧ�ţ�" + number);

	}
}
