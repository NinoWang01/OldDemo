package com.pb.b;
/*
 * �����ķ��ࣺ
 * 1�������������ͣ�8�֣���
 * �١�int 
 * �ڡ�double
 * �ۡ�long
 * �ܡ�short
 * �ݡ�char
 * �ޡ�float
 * �ߡ�boolean
 * ��byte   
 * 2��������������  
 *  �����String �������͵���������
 * 3�������͵���������
 */
public class Test2 {
	 public static double a = 100;
	 public static long b = 10;
	 public static short c = 5;
	 public static char d = '��';
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
		 * long he short�����Զ�ת����double���͵�
		 * ��������ת���ļ����ɸߵ���
		 * �١� double
		 * �ڡ�float
		 * �ۡ�long
		 * �ܡ�int
		 * �ݡ�   short �� char
		 * �ޡ�byte 
		 */
	}
	/*
	 * 1��дһ�����򡢷ֱ���
	 *  double float
	 *  byte char
	 *  �������Ϻ�����ת��
	 * 2�����ݰ��ֻ����������͵Ĵ洢��С����������Ƕ�Ӧ�Ķ�����
	 * 
	 */
 
}
