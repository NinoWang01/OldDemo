package com.pb.c;

import java.util.Scanner;

public class ForTest {
	/*
	 * for(int i=1;i<=20;i++){
				System.out.println("�Ͽγٵ����������Գ�"+i+"��");
			}
		(int i=1;i<=20;i++):�������������ʽ
		int i=1; ��forѭ��ѭ������
		i<=20;  �� forѭ��ѭ��������
		i++     ��forѭ��ѭ������ֵ�ĸı䣬�Ӷ��ƶ�forѭ���ļ���
	 */
	public static int a;
	public static int b;
	public static int c;
	public static void main(String[] args) {

		for(int i=1;i<=10;i++){
			System.out.println("��"+i+"��ʹ�ü�������");
			System.out.println("��������������");
			// ������Ŀ�ݼ�:Ctrl+Shift+o
			Scanner input = new Scanner(System.in);
			System.out.println("�����һ������");
			a = input.nextInt();
			System.out.println("����ڶ�������");
			b = input.nextInt();
			System.out.println("������һ���������");
			String s = input.next();
			jiSuanQi(a, b, s);
		}
	}
	
	public static void jiSuanQi(int a, int b, String str) {
		if (str.equals("+")) {
			c = a + b;
			System.out.println(c);
		}
		if (str.equals("-")) {
			c = a - b;
			System.out.println(c);
		}
		if (str.equals("*")) {
			c = a * b;
			System.out.println(c);
		}
		if (str.equals("/")) {
			if (b != 0) {
				c = a / b;
				System.out.println(c);
			} else {
				System.out.println("��ĸ����Ϊ��");
			}

		}

	}
	
	
	
	
	
	
}
