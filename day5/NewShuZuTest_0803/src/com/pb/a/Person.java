package com.pb.a;

import java.util.Scanner;

public class Person {

	/*
	 * ��ͨ�ķ����� name;//���� sex;//�Ա� age;//���� height;//��� type;//�Ը�
	 */
	public static String name;
	public static String sex;
	public static int age;
	public static double height;
	public static String type;
	// �����緹Ҫ�ԵĶ���
	public static String food;

	public static void main(String[] args) {
		String str=new String();
		enterShuRu();
		// ����eat���ԣ�������һ��Я�������ķ���
		eat(name,type,age);//����������ʵ�Ρ�

//		study();
	}

	/*
	 *  ����ĳԷ���Ϊ
	 *  str: ������һ����ռλ���Ķ���
	 *  ����eat�����ĸ�����������  �������֮���á� , ������
	 *  name��str��age�����ǽ�����ʽ�������β�
	 */
	public static void eat(String name,String str, int age) {
		
		
		System.out.println(name + "����" + age + "һ��Ҫ������" + "�緹����" + str);
	}

	// �����ѧϰ��Ϊ
	public static void study() {
		System.out.println(name + "����" + age + "ÿ�춼Ҫѧϰ���򿪷�");
	}

	// ���ռ�������
	public static void enterShuRu() {
		// �����������Ϣ
		System.out.println("�����������Ϣ:");
		Scanner input = new Scanner(System.in);
		System.out.println("�������֣�");
		name = input.next();
//		System.out.println("�����Ա�");
//		sex = input.next();
		System.out.println("�������䣺");
		age = input.nextInt();
//		System.out.println("������ߣ�");
//		height = input.nextDouble();
		System.out.println("�����Ը�");
		type = input.next();
		System.out.println("����Ե��緹�ǣ�");
		food = input.next();
	}

}
