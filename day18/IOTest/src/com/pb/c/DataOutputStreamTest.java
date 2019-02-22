package com.pb.c;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 采用DataOutputStream给Java的基本数据进行序列化
 * 
 */
public class DataOutputStreamTest {
	// 写文件输出流
	public static FileOutputStream fos = null;
	// 数据输出流对象
	public static DataOutputStream dos = null;
	public static void main(String[] args) {
		// 文件对象
		File file = new File("d:/haohao/new/three.txt");
		try {
			fos = new FileOutputStream(file);
			// 文件输出流对象放入数据输出流对象中
			dos = new DataOutputStream(fos);
			// 往文件中写数据
			// 写一个汉字
			dos.writeUTF("中国生活真美好");
			// 写一个整数
			dos.writeInt(56);
			// 写一个字符
			dos.writeChar('a');
			dos.writeChars("张超凡");
			// 浮点型
			dos.writeDouble(60.9);
  
			// 关闭流
			dos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
