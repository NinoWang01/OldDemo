package com.pb.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

//		File file = new File("d:/haohao/cc03/a.txt");
		// 获得操作字符流的对象
		try {
			FileReader reader = new FileReader("d:/haohao/cc03/a.txt");
			// 读取文件中的字符
			int len;
			// 循环
			while ((len = reader.read()) != -1) {
				System.out.println("读取这个a.txt文件当中的字符为：" + (char) len);
			}
			// 关闭流
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
