package com.pb.b;

public class StringBufferTest {
	/*
	 * �ڡ�append���ַ���������ָ�����ַ���׷�ӵ���ǰ�ַ�����ĩβ 
	 * �ۡ�insert���������ַ���������ָ�����ַ�����ӵ����ַ�����ָ����λ��
	 * �ܡ�reverse��������ת��ǰ�ַ�����ǰ��λ��
	 * �ݡ�delete������a������b��ɾ��ָ��λ�ô�a~(b-1)���ַ���
	 */
	public static String str = "macjadhsfhafw123456789";
	
	public static String s = "12345";

	public static void main(String[] args) {
		// ������StringBuffer�Ķ���
		StringBuffer sss = new StringBuffer(str);
		StringBuffer sttt=new StringBuffer();
		StringBuffer st=new StringBuffer(20);
		
		// ׷���ַ���
//		sss.append(s);
//		System.out.println(sss);
//		sss.insert(6, s);
//		System.out.println(sss);
		System.out.println(sss);
//		sss.reverse();
//		System.out.println(sss);
//		sss.delete(5, 9);
		sss.delete(5, 13);
		System.out.println(sss);
		

	}
}
