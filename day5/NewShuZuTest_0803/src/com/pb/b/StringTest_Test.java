package com.pb.b;

public class StringTest_Test {
	public static String s1 = "�����ǵ�����ĺܲ������ã���Ҫ����ǵļ��Ͱ£�����";
	public static String s2 = "http";
	public static String s3 = "macjadhsfhafw";//1  /4  10

	public static void main(String[] args) {
		// s1:25 s2: 4 s3: 13
		System.out.println(s3.length());
		// ��ȡ ������ĺ����ã���Ҫ���Ͱ�!!!
		String str1 = s1.substring(0, 2);
		String str2 = s1.substring(5, 8);
		String str3 = s1.substring(11, 16);
		String str4 = s1.substring(20, 24);
		System.out.println(str1 + str2 + str3 + str4);

		// �滻 ���е�a�滻��
		String ss=s3.replace("a", s2);
		System.out.println(ss);
		
		
		
		
		
		

	}
}
