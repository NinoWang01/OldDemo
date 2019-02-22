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
		 *  |  3 0000 0011 ( ͬλֻҪ��һ��Ϊ1��ȡ1)
		 * a:2   0000 0010
		 * b:3   0000 0011
		 *  &  2 0000 0010 (ͬλ��Ϊ1��ʱ��ȡ1) 
		 * a:2   0000 0010
		 * b:3   0000 0011   
		 *  ^  1 0000 0001 (��ͬΪ0����ͬΪ1)
		 * a:2   0000 0010
		 *  ~ -3 0000 0011 (����ȡ�����ȱ�ɸ����ټ�1)
		 * b:3   0000 0011
		 *  ~ -4 0000 0100(����ȡ������+1�ٱ������)
		 */
		
		
		System.out.println(a | b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~f);

	}

}
