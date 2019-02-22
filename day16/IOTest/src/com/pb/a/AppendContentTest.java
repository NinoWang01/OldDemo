package com.pb.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class AppendContentTest {
	public static void main(String[] args) {
		// 创建一个个file对象
		File file = new File("D:/haohao/ee02/aa.txt");
		// 要追加的内容
		String ss = "asdfgsdhf";

		try {
			// 输出流对象,注意参数个数
			OutputStream os = new FileOutputStream(file,true);

			// 把字符串转化成字节数组
			byte[] buffer = ss.getBytes();

			// os.write(buffer);
			for (int i = 0; i < buffer.length; i++) {
				os.write(buffer[i]);
			}

			// 关闭流

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
