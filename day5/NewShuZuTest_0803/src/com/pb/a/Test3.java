package com.pb.a;

import java.util.Scanner;

public class Test3 {
	static	String name="����";
	static String sex="��";

	public static double a, b;

	/*
	 * �������η���
	 * 1��public �����������������ԡ�������������  
	 *             Ȩ�ޣ�
	 * 2��private �� ˽�еģ����������������ԡ�������������
	 *             Ȩ�ޣ�
	 * 3��default:  ���������������ԡ������������� 
	 *             Ȩ�ޣ� 
	 * 4��protecded : ���������������ԡ�������������
	 *             Ȩ��
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
//		shuRu();
//		JiSuan(a, b);
		System.out.println(name+"\t"+sex);
		
//		System.out.println(JiSuan(a, b));
	}

	// ��������
	  static void shuRu() {
		Scanner input = new Scanner(System.in);
		System.out.println("������:");
		a = input.nextDouble();
		System.out.println();
		b = input.nextDouble();

	}

	// ����,
	public static double JiSuan(double a, double b) {
		return a + b;
	}

}
