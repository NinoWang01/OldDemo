package com.pb.c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectXuLiHuaTest {

	// 输出流对象
	public static FileOutputStream fos = null;
	// 对象输出流
	public static ObjectOutputStream oos = null;

	public static void main(String[] args) {
		// 文件的对象
		File file = new File("d:/haohao/next");
		File file2 = new File(file, "object.txt");
		// 实例化当前的类对象
		User user = new User(23, "张三丰", "男");
		// 判断文件存不存在
		if (!file.exists()) {
			file.mkdirs();
		}
		// 文件不存在创建文件
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			fos = new FileOutputStream(file2);
			// 输出流对象放入对象输出流对象当中
			oos = new ObjectOutputStream(fos);
			// 把序列化的对象保存到文件当中
			oos.writeObject(user);

			System.out.println("写对象进入文件当中成功");

			// 关闭流
			oos.close();
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
