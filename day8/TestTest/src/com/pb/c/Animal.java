package com.pb.c;

public class Animal {

	public int age;
	public String name;

	/*
	 * 创建一个静态内部类
	 */
	public static class Cat {
		public String lingXing;
		public void speek(){
			System.out.println("这是一个只猫"+"\t"+lingXing);
		}

	}

}
