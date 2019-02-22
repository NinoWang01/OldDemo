package com.pb.c;

import java.io.File;

public class Test3 {

	/*
	 * 转义符
	 * 	"\"
	 *  \t (制表符), 
	 *  \r（回车）, 
	 *  \n（换行）, 
	 *  \b（退格符）
	 */
	
	public static void main(String[] args) {
		File file=new File("D:\\haohao");
		//产生一个空格的效果
		System.out.println("\t"+"这是好的"+"\t"+"我离前边有多远"+"\t");
		
		System.out.print("asfgsdhdfgfjg"+"\n");
		System.out.println("23465345745684");
		System.out.println("\b"+"agsdfgsh"+"\b");
		
		
		
	}
}
