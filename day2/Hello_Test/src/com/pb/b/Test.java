package com.pb.b;

import java.util.Scanner;

public class Test {
	public static final int CHANGE_INTENTER=1;
	
	
	
	
	public static void main(String[] args) {
		System.out.println("��ѡ��1���·� 2��Ь�ӡ�3��ñ��");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();

		switch (key) {
		case 1:
			System.out.println("С��Ҫ���·�");
			break;
		case 2:
			System.out.println("С��Ҫ��Ь��");
			break;
		case 3:
			System.out.println("С��Ҫ��ñ��");
			break;
		default:
			break;
		}
	}
}
