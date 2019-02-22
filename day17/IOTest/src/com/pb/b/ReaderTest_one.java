package com.pb.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReaderTest_one {
	// 获取文件输入流
	public static FileInputStream fis = null;
	// 获取
	public static InputStreamReader reader = null;
	// 获取或区对象
	public static BufferedReader br = null;
	public static void main(String[] args) {
		// 创建文件对象
		File file = new File("d:/haohao/ee02/test.txt");
		try {
			// 实例化
			fis = new FileInputStream(file);
			reader = new InputStreamReader(fis, "GBK");
			br = new BufferedReader(reader);// 放到缓冲区里边去
			// 在控制台打印输出
			String str;
			// 循环
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			reader.close();
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
