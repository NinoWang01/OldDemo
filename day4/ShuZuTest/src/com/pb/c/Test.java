package com.pb.c;

public class Test {
	/*
	 * ��������һ�����飬 int:����������������͵Ĺؼ��� [] ��һ�������� a��������������֣���������֣� a:������˼������ջ�ռ��� new
	 * int[20] ��������˼�����Ķѿռ���
	 */

	static int[] a = new int[20];
	static int s[] = new int[20];
	static double b;
	public static long[] c = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		/*
		 *  �����������ʱ��û�и�������Ԫ�أ�
		 *  c.length : ����ĳ��ȣ�������Ϊ������±���ʹ��
		 */
		
		for (int i = 0; i < c.length; i++) {
			/*
			 * ��������Ԫ�ص�ʱ���Ӧc[4]=5
			 * ������±궼�Ǵ�0��ʼ�ģ���    ����.length-1  ,  ����
			 */
			System.out.print(c[i]+"\t");
			
		}
		System.out.println();
		System.out.println(c.length);//����ĳ���
		System.out.println(c[c.length]);
	}

}
