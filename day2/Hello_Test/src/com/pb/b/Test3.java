package com.pb.b;

/*
 * 1��дһ�����򡢷ֱ���
 *  double float
 *  byte char
 */
public class Test3 {
	public static double a = 90.0;
	public static float b = 27;
	public static byte c = 6;
	public static char d = 67;

	public static void main(String[] args) {
//		a = b + c + d;
//		System.out.println(a);
//		b=(float) (a+c+d);
//		System.out.println(b);
//		c=(byte) (a+b+d);
//		System.out.println(c);
		//���ݶ�ʧ
		d = (char) (a + b + c);
		
		
		System.out.println(d+1);

	}

}
