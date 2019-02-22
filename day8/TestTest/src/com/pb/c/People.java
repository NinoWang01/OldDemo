package com.pb.c;

public class People {

	public int age;
	public String name;

	/*
	 *  一个方法
	 *  方法内部类类似于，局部变量，只能在创建它的方法中使用
	 *  
	 *  封装：封装的是方法和属性（类做的封装）
	 *  
	 *  用方法封装了类：在方法中创建类也比较少见
	 *  
	 *  
	 *  
	 */
public void hao() {
	
	  	class Student {
			public int number;
			public void huai() {
				System.out.println("我是方法内部类");
			}
		}
		Student st=new Student();
		st.number=20160101;
		st.huai();
	}
	
 
	
	

}
