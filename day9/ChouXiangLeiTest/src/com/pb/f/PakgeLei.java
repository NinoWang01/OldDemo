package com.pb.f;

public class PakgeLei {

	public static int a = 12;
	public static double b = 12;

	public static void main(String[] args) {

		// 自动装箱，意思是把一个变量装箱成它对应的包装类
		Integer i = new Integer(a);
		Integer q = new Integer(15);
		
		Integer s=Integer.valueOf(5);
//		System.out.println(s);
		
//		int b = q;
//		// System.out.println(i);
//		// System.out.println(b);
//
		String ss = new String("23423");
		Integer aaa=Integer.valueOf(ss);
		System.out.println(aaa);
//
//		/*
//		 * Integer:这个返回，
//		 */
//		Integer t = Integer.valueOf(s).intValue();
//
//		System.out.println(t+1);

		Double ddd=(Double) valueOf(12.9);
	}

	//源码的开发
	public static Object valueOf(Object obj) {

		return obj;

	}
	
	
	
	
	
	
	
	
	

}
