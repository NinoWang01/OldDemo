package com.pb.c;

import java.util.Scanner;

import com.pb.a.Book;
import com.pb.b.Person;

public class Test {
	public static int sum;
	public static double totleMoney;

	public static void main(String[] args) {
		Book book = new Book();
		Person p = new Person();

		/*
		 * �Ӽ����Ͻ��� 1�������û��Ľ�ɫ 2�������������+���� 3��������ĵ���
		 */
		System.out.println("���빺�����û���");
		Scanner input = new Scanner(System.in);
		p.role = input.next();
		System.out.println("���빺�������:");
		book.nameBook = input.next();
		System.out.println("�ܹ����˶��ٱ���");
		sum = input.nextInt();
		System.out.println("������ĵ��ۣ�");
		book.price = input.nextDouble();
		//��ͨ�û�
		if( p.role.equals("��ͨ�û�")  ){
		System.out.println("������ͨ�û����򸶷Ѷ��٣�");

		totleMoney = sum * book.price;
		System.out.println("����"+p.role+"�û����踶�ѣ�" + totleMoney + "Ԫ");

		}
		//��Ա�û�
		if(p.role.equals("��Ա�û�")){
		System.out.println("�����Ա�û����򸶷Ѷ��٣�");
		totleMoney = sum * book.price;
		if (totleMoney > 1000) {
			totleMoney = totleMoney * 0.8;
			System.out.println("����"+p.role+"�û����踶�ѣ�"  + totleMoney + "Ԫ");
		} else if (totleMoney < 1000) {
			totleMoney = totleMoney * 0.85;
			System.out.println("����"+p.role+"�û����踶�ѣ�"  + totleMoney + "Ԫ");
		}
		
		}	
		
		//VIP�û�

		if(p.role.equals("VIP�û�")){
		System.out.println("����VIP�û����򸶷Ѷ��٣�");
		totleMoney = sum * book.price;
		if (totleMoney < 3000) {
			totleMoney = totleMoney * 0.75;
			System.out.println("����"+p.role+"�û����踶�ѣ�"  + totleMoney + "Ԫ");
		} else if (totleMoney > 3000) {
			totleMoney = totleMoney * 0.7;
			System.out.println("����"+p.role+"�û����踶�ѣ�"  + totleMoney + "Ԫ");
		}
		}

	}

}
