package com.pb.c;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 使用DataInputStream进行反序列
 */
public class ReceverDataInputStreamTest {
	public static FileInputStream fis = null;
	// 数据输入流
	public static DataInputStream dis = null;

	public static void main(String[] args) {
		File file = new File("d:/haohao/new/three.txt");

		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			// 读取文件当中的数据
			String str = dis.readUTF();
			System.out.println(str);
			// 读取文件当中的数据
			String str1 = dis.readUTF();
			System.out.println(str1);
			int a = dis.readInt();
			System.out.println(a);
			char ch1 = dis.readChar();
			System.out.println(ch1);
			char ch2 = dis.readChar();
			char ch3 = dis.readChar();
			char ch4 = dis.readChar();
			System.out.println(ch2+""+ch3+""+ch4);
//			System.out.println((char)(ch2+ch3+ch4));
			// 读double
			 double b=dis.readDouble();
			 System.out.println(b);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
