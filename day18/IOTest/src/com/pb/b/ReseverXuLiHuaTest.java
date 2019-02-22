package com.pb.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReseverXuLiHuaTest {

	public static final String STR="中国真好!!!";
	// 声明输入流
	public static FileInputStream fis;
	public static int data;
	public static void main(String[] args) {
		// 创建文件对象
		File file = new File("D:\\haohao\\dd02\\tianya.txt");
		try {
			// 获取输入流对象
			fis = new FileInputStream(file);
			// 读65
			data = fis.read();
			System.out.println(data);
			// 读122
			data = fis.read();
			System.out.println(data);
			// 去读中这个汉字0x4e 2d
			int data1 = fis.read();
			// 高八位的输出
			System.out.println("中--的高八位" + Integer.toHexString(data1));
			// 读出中的低八位
			int data2 = fis.read();
			System.out.println("中--的低八位" + Integer.toHexString(data2));
			// 转化
			int data3 = data1 << 8 | data2;
			System.out.println("中===="+(char)data3 + data3);
			System.out.println(Integer.toHexString(data3));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
