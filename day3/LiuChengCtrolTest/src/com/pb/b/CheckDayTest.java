package com.pb.b;

import java.util.Scanner;

public class CheckDayTest {
	public static void main(String[] args) {
		tianShu();
	}
	public static void tianShu(){
		System.out.println("请输入要查询的月份：");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		
		switch (month) {
		case 1:            
		case 3:               
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"月份的天数是31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			System.out.println(month+"月份的天数是30天");
			break;
		case 2:
			System.out.println(month+"月份的天数是28天");
		default:
			System.out.println("请输入合理的月份：例如  1、 2 。。。12 ");
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
