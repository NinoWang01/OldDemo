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
		 * 从键盘上接收 1、购买用户的角色 2、购买书的数量+书名 3、输入书的单价
		 */
		System.out.println("输入购买书用户：");
		Scanner input = new Scanner(System.in);
		p.role = input.next();
		System.out.println("收入购买的书名:");
		book.nameBook = input.next();
		System.out.println("总共卖了多少本：");
		sum = input.nextInt();
		System.out.println("输入输的单价：");
		book.price = input.nextDouble();
		//普通用户
		if( p.role.equals("普通用户")  ){
		System.out.println("计算普通用户购买付费多少：");

		totleMoney = sum * book.price;
		System.out.println("你是"+p.role+"用户，需付费：" + totleMoney + "元");

		}
		//会员用户
		if(p.role.equals("会员用户")){
		System.out.println("计算会员用户购买付费多少：");
		totleMoney = sum * book.price;
		if (totleMoney > 1000) {
			totleMoney = totleMoney * 0.8;
			System.out.println("你是"+p.role+"用户，需付费："  + totleMoney + "元");
		} else if (totleMoney < 1000) {
			totleMoney = totleMoney * 0.85;
			System.out.println("你是"+p.role+"用户，需付费："  + totleMoney + "元");
		}
		
		}	
		
		//VIP用户

		if(p.role.equals("VIP用户")){
		System.out.println("计算VIP用户购买付费多少：");
		totleMoney = sum * book.price;
		if (totleMoney < 3000) {
			totleMoney = totleMoney * 0.75;
			System.out.println("你是"+p.role+"用户，需付费："  + totleMoney + "元");
		} else if (totleMoney > 3000) {
			totleMoney = totleMoney * 0.7;
			System.out.println("你是"+p.role+"用户，需付费："  + totleMoney + "元");
		}
		}

	}

}
