package com.pb.f;

public class PakgeLei {

	public static int a = 12;
	public static double b = 12;

	public static void main(String[] args) {

		// �Զ�װ�䣬��˼�ǰ�һ������װ�������Ӧ�İ�װ��
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
//		 * Integer:������أ�
//		 */
//		Integer t = Integer.valueOf(s).intValue();
//
//		System.out.println(t+1);

		Double ddd=(Double) valueOf(12.9);
	}

	//Դ��Ŀ���
	public static Object valueOf(Object obj) {

		return obj;

	}
	
	
	
	
	
	
	
	
	

}
