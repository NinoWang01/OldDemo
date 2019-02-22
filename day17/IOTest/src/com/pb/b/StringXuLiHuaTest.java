package com.pb.b;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringXuLiHuaTest {
	public static String str="ABC生活";
	public static void main(String[] args) {
		//序列化字符串
		try {
			byte[] dt=str.getBytes("UTF-16BE");
			//编码后的字节数组
			System.out.println("被UTF-16BE进行编码的字符串"+Arrays.toString(dt));
			//反序列化输出字符串
			String s1=new String(dt,"UTF-16BE");
//			String s2=new String(dt,"UTF-8");
			System.out.println(s1);
//			System.out.println(s2);
			byte[] ddt=str.getBytes("UTF-8");
			System.out.println("被UTF-8进行编码的字符串"+Arrays.toString(ddt));
			//解码UTF-8编码字符串
			String s2=new String(ddt,"UTF-8");
			System.out.println(s2);
			//用国标编码
			byte[] dddt=str.getBytes("GBK");
			System.out.println("被GBK进行编码的字符串"+Arrays.toString(dddt));
			String s3=new String(dddt,"GBK");
			System.out.println(s3);
			byte[] ddddt=str.getBytes("GB2312");
			System.out.println("被GBK进行编码的字符串"+Arrays.toString(dddt));
			String s4=new String(dddt,"GB2312");
			System.out.println(s4);
			/*
			 * 编码和解码不区分大小写
			 */
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
