package com.pb.b;
/*
 * 变量的分类：
 * 1、基本数据类型（8种），
 * ①、int 
 * ②、double
 * ③、long
 * ④、short
 * ⑤、char
 * ⑥、float
 * ⑦、boolean
 * ⑧byte   
 * 2、引用数据类型  
 *  数组和String 、类类型的数据类型
 * 3、类类型的数据类型
 */
public class Test2 {
	 public static double a = 100;
	 public static long b = 10;
	 public static short c = 5;
	 public static char d = '啊';
	 public static float e = 20;
	 public static boolean f;
	 public static byte g = 2;
//	public static double a;
//	public static long b;
//	public static short c;
//	public static  char d;
//	public static float e;
//	public static boolean f;
//	public static byte g;
	public static void main(String[] args) {
//		System.out.println(a+b+c);
		// //u0000
//		System.out.println(d+e+g);
//		System.out.println(d+1);
		hao();

	}
	
	public static void hao(){
	
		b=(long) (a+c);
		c=(short) (a+b);
		a=b+c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		/*
		 * long he short可以自动转换成double类型的
		 * 数据类型转换的级别由高到底
		 * ①、 double
		 * ②、float
		 * ③、long
		 * ④、int
		 * ⑤、   short 和 char
		 * ⑥、byte 
		 */
	}
	/*
	 * 1、写一个程序、分别用
	 *  double float
	 *  byte char
	 *  进行向上和向下转型
	 * 2、根据八种基本数据类型的存储大小，来理解它们对应的二进制
	 * 
	 */
 
}
