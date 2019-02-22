package com.pb.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static InputStream in;

	public static void main(String[] args) {

		// 创建一个个file对象
		File file = new File("D:/haohao/ee02/java.txt");

		/*
		 * 获得输入流对象 注：流的读写，会发生异常 步骤1、设置源文件的路径； 步骤2、定义文件输入流对象的引用变量； 步骤3、创建文件输入流对象；
		 * 步骤4、(通过循环每次读取源文件中一个字节的数据；) 步骤5、关闭文件输入流对象。
		 */
		try {

			// 输入流对象的
			in = new FileInputStream(file);

			// 读文件
			int a;
			while (true) {
				// 记住每一次读取的一个字节
				a = in.read();
				// 判断读取到文件的结尾
				if (a == -1) {
					break;
				}

				
				// 输出你从文件当中读取的内容
				System.out.println(a);
			}

			// in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// if (in != null) {
			// in.close();
			// }
		} catch (Exception e) {
			e.printStackTrace();

		} 
//		finally {
//			if (in != null) {
//				try {
//					in.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}

	}

}
