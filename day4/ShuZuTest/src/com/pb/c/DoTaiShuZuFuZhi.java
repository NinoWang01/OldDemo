package com.pb.c;

public class DoTaiShuZuFuZhi {
	/*
	 * 动态化赋值1、int[] aa = new int[] { 1, 2, 3, 4, }; aa[0]=100;//单独动态改变元素
	 */
	public static int[] aa = new int[] { 1, 2, 3, 4 };
	// 这种方式是不允许
	// public static int[] cc = new int[5]{ 1, 2, 3, 4,7};

	public static int[] bb = { 1, 2, 3, 4, };
	public static String[] str = { "a", "b", "c", "d" };
	

	public static void main(String[] args) {

		aa[0] = 100;// 单独动态改变元素
		
		String ss="adgsghfgj";

		System.out.println(bb.length);//是属性
		System.out.println(str.length);//这里是String类型的数组调用属性
		System.out.println(ss.length());//这个调用的是方法
	 

	}
}
