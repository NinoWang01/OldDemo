package com.pb.a;

public class Student {

	/*
	 * 类调用属性和方法
	 */
	public static void main(String[] args) {

		People p = new People();
		/*
		 * p:能够操作People类中的属性和方法
		 * . :在Java程序中使用来调用的 
		 */
		p.name="123";
		p.age=12;
		p.sex="d";
		/*
		 * 用类来直接调用,那么类中的属性和方法必须的是静态的
		 * 
		 */
		
		People.country="中国";
		People.sleep();
		
	 
		
		
		

	}
	
	
	
	
	

}
