package com.pb.b;

public class StringBufferTest {
	/*
	 * ②、append（字符串）：将指定的字符串追加到当前字符串的末尾 
	 * ③、insert（整数，字符串）：将指定的字符串添加到此字符串的指定的位置
	 * ④、reverse（）：翻转当前字符串的前后位置
	 * ⑤、delete（整数a，整数b）删除指定位置从a~(b-1)的字符串
	 */
	public static String str = "macjadhsfhafw123456789";
	
	public static String s = "12345";

	public static void main(String[] args) {
		// 创建的StringBuffer的对象
		StringBuffer sss = new StringBuffer(str);
		StringBuffer sttt=new StringBuffer();
		StringBuffer st=new StringBuffer(20);
		
		// 追加字符串
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
