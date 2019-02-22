package com.pb.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeFileNameTest {
	// 获取文件输入流
	public static FileInputStream fis = null;
	// 获取
	public static InputStreamReader reader = null;
	// 获取或区对象
	public static BufferedReader br = null;
	// 读字符的输出流
	public static FileWriter fw = null;

	public static void main(String[] args) {
		File file = new File("d:/haohao/ee02/test.txt");
		// 生成一个新的文件
		File file2 = new File("d:/haohao/ee02/new_test.txt");
		try {
			// 输入流
			fis = new FileInputStream(file);
			// 读取文件
			reader = new InputStreamReader(fis, "gbk");
			// 缓冲区
			br = new BufferedReader(reader);
			// 输出流
			fw = new FileWriter(file2);
			// 向新的文件中写内容

			String len;
			// 循环
			while ((len = br.readLine()) != null) {
				// 向新文件写东西
				fw.write(len +"\r\n");
			}

			fw.close();
			br.close();
			reader.close();
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
