package com.pb.c;

public class Test {
	/*
	 * 你声明了一个数组， int:声明数组的数据类型的关键字 [] ：一对中括号 a：数组变量的名字（数组的名字） a:存放在了计算机的栈空间中 new
	 * int[20] ：存放在了计算机的堆空间中
	 */

	static int[] a = new int[20];
	static int s[] = new int[20];
	static double b;
	public static long[] c = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		/*
		 *  当声明数组的时候没有给定数组元素，
		 *  c.length : 数组的长度，不能作为数组的下标来使用
		 */
		
		for (int i = 0; i < c.length; i++) {
			/*
			 * 输出第五个元素的时候对应c[4]=5
			 * 数组的下标都是从0开始的，到    数组.length-1  ,  结束
			 */
			System.out.print(c[i]+"\t");
			
		}
		System.out.println();
		System.out.println(c.length);//数组的长度
		System.out.println(c[c.length]);
	}

}
