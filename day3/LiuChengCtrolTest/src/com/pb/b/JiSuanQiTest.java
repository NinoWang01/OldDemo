package com.pb.b;

import java.util.Scanner;

public class JiSuanQiTest {
	public static int a;
	public static int b;
	public static int c;
	public static int i;

	public static void main(String[] args) {

		while (i < 2) {
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
			i++;
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
