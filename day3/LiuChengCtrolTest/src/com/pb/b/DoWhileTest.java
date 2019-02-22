package com.pb.b;

public class DoWhileTest {

	/*
	 * do{
			循环内容;
		} while(循环继续的条件表达式);
	 */
	
	public static int i;
	public static void main(String[] args) {
		
		do{
			System.out.println("第" + i + "次输出");
			i++;// 控制整个while的循环次数
		} while(i<10);
	}
	
	
	
	
	
}
