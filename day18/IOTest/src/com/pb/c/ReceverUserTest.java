package com.pb.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 反序列化对象，从文件中读出来
 */
public class ReceverUserTest {
	// 文件输入流
	public static FileInputStream fis = null;
	// 对象输入流
	public static ObjectInputStream ois = null;
	// 要反序列化的对象,接收反序列化后的数据的
	public static User user = null;
	public static void main(String[] args) {
		// 文件对象
		File file = new File("d:/haohao/next/object.txt");
		try {
			// 先放入输入流当中去
			fis = new FileInputStream(file);
			// 文件输入流对象放入对象输入流当中去
			ois = new ObjectInputStream(fis);
			// 接收反序列化的对象
			user = (User) ois.readObject();
			System.out.println(user);
			// 关闭流
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
