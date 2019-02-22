package com.pb.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) {
		// 创建一个个file对象
		File file = new File("D:/haohao/ee02/aa.txt");
		try {
			// 输出流对象
			OutputStream os = new FileOutputStream(file);
			// 创建要写入文件中的内容
			String ss = "上课了，别睡了";
			// 缓存,操作的是字节流
			// byte[] buffer=new byte[10];
			byte[] buffer = ss.getBytes();
			for (int i = 0; i < buffer.length; i++) {
				// 向文件中写数据
//				os.write(buffer[i]);
			}
			os.write(buffer);
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
		
		
		
		
		
		
		
	}
}
