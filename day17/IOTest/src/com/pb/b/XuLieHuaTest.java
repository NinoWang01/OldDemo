package com.pb.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 序列化类
 */
public class XuLieHuaTest {
	public static FileOutputStream fos;
	public static void main(String[] args) {
		// 创建文件对象
		File file = new File("d:/haohao/dd02/");
		// 判断
		if (!file.exists()) {
			file.mkdirs();
		}
		// 创建一个新的file实例
		File file2 = new File(file, "tianya.txt");
		try {
			// 输入流对象
			fos = new FileOutputStream(file2);
			// 在创建一个变量
			int zhong = '中';
			//写了一个整数
			fos.write(65);
			fos.write(122);
			/*
			 * fos.write(zhong),丢失当前数据的高八位，只能把低八位写进去
			 */
			//先把高八位数据转变为低八位数据
			fos.write(zhong>>>8);
			//高八位清零，低八位保留
			fos.write(zhong);
			System.out.println(Integer.toHexString(zhong));//输出 的是十六进制表现形式
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
