package com.pb.b;

import java.util.Scanner;

public class SwitchTest2 {

	/*
	 * С����һ��ÿ�춼����ʲô 
	 * ����һ ���ܲ� 
	 * ���ڶ� ��ȥ���� 
	 * ������ ��ȥ��Ӿ 
	 * ������ ��Լ���ӿ���Ӱ 
	 * ������ ����Լһ��LOL 
	 * ������ ����Ϣ
	 * ������ ��˯��
	 */
 

	public static String name="С��";
	public static void main(String[] args) {
		behavior();
	}

	public static void behavior() {
		System.out.println("�����������˽�С������һ�ܵ���һ���������������룺����һ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		// switch���ȥƥ��
		switch (str) {
		case "����һ":
		case "���ڶ�":
			System.out.println("ȥ����  ");
			break;
		case "������":
			System.out.println("ȥ��Ӿ ");
			break;
		case "������":
			System.out.println("Լ���ӿ���Ӱ  ");
			break;
		case "������":
			System.out.println("��Լһ��LOL ");
			break;
		case "������":
			System.out.println("��Ϣ");
			break;
		case "������":
			System.out.println("˯�� ");
			break;
		default:
			break;
		}

	}

}
