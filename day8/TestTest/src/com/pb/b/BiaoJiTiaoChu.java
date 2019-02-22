package com.pb.b;

public class BiaoJiTiaoChu {

	public static void main(String[] args) {

		/*
		 * 添加一个标记,当j=1的时候跳出循环
		 *  第0次的输出	第1次的输出	第2次的输出	
			第0次的输出	第1次的输出	第2次的输出	
			第0次的输出	第1次的输出	第2次的输出
				
			第0次的输出	第0次的输出	第0次的输出
		 * loop:有  变量名  +  ：组成
		 * 跳出整个循环，尤其是嵌套的循环
		 * 
		 */
		
		
		loop:	
			
		for (int i = 0; i < 3; i++) {
			
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print("第"+j +"次的输出"+ "\t");
				
				continue loop;//当j=1的时候又跳到了标记的位置
			}
			System.out.println();
			
			
		}
		
		
		

	}

}
