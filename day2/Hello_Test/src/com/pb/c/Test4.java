package com.pb.c;

public class Test4 {
	public static int a = 2;
	public static int b = 3;
	public static int c = 1;
	public static int d = 4;
	public static int e = 30;
	public static int f = -30;

	// | & ^ ~
	public static void main(String[] args) {

		/*
		 * a:2   0000 0010
		 * b:3   0000 0011
		 *  |  3 0000 0011 ( 同位只要有一个为1，取1)
		 * a:2   0000 0010
		 * b:3   0000 0011
		 *  &  2 0000 0010 (同位都为1的时候，取1) 
		 * a:2   0000 0010
		 * b:3   0000 0011   
		 *  ^  1 0000 0001 (相同为0，不同为1)
		 * a:2   0000 0010
		 *  ~ -3 0000 0011 (正数取反是先变成负数再减1)
		 * b:3   0000 0011
		 *  ~ -4 0000 0100(负数取反是先+1再变成正数)
		 */
		
		
		System.out.println(a | b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~f);

	}

}
