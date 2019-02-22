package com.pb.b;

public class ObjectTest {
	public static String s1 = "12345";
	public static String s2 = "12345";

	public static void main(String[] args) {
		Object obj = new Object();
		String s3=new String("12345");
		
		//ÅÐ¶Ïs1ÊÇ·ñµÈÓÚs2

		if(s1==s3){
			System.out.println(s1==s2);
			System.out.println("s1==s3");
		}
		if(s1.equals(s2)){
			System.out.println(s1==s2);
			System.out.println("s1==s2");
		}

	}
	
	
	
}
