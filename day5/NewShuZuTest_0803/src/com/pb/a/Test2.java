package com.pb.a;

import java.util.Scanner;

public class Test2 {
	
	public static String name;
	public static String sex;
	public static int age;
	public static double height;
	public static String type;
	// �����緹Ҫ�ԵĶ���
	public static String food;

	public static void main(String[] args) {
		
		System.out.println(backHeight());//���

	}

	/*
	 * 1����ͨ����
	 * 2�����в����ķ���
	 * 3�����в����ͷ����������͵ķ������ܹ�������Ӹ��ӻ�������
	 * 
	 */
	public static void eat(String name, String str, int age) {

		System.out.println(name + "����" + age + "һ��Ҫ������" + "�緹����" + str);
	}

	public static void enterShuRu() {
		// �����������Ϣ
		System.out.println("�����������Ϣ:");
		Scanner input = new Scanner(System.in);
		System.out.println("�������֣�");
		name = input.next();
		// System.out.println("�����Ա�");
		// sex = input.next();
		System.out.println("�������䣺");
		age = input.nextInt();
		// System.out.println("������ߣ�");
		// height = input.nextDouble();
		System.out.println("�����Ը�");
		type = input.next();
		System.out.println("����Ե��緹�ǣ�");
		food = input.next();
	}
	
	/*
	 * ���з������͵ķ���
	 * double������������double
	 * �ڷ�������߱���Ҫ��һ�� return 
	 * �������Ĵ��з������͵ķ��������ص��������ͣ��١��ࣨAndroid�г��������ڡ����ϣ�Android�г��������ۡ�����ʵ����Android�г�����
	 */
	public static double backHeight(){
		
		return 0.0;
	}
	
	
	
	
	/*
	 * 
	 * 
	 * д���������Ӽ�������
	 * 	double  add(double d1, double d2){
	 * 
					return d1+d2;
					
			}
	 */
	
	
	
	
	
	
	
	
	
	
	
}
