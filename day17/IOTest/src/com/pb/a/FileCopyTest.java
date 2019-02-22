package com.pb.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {
	/*
	 * 文件的拷贝
	 */
	public static InputStream in;
	public static OutputStream os;

	public static void main(String[] args) {
		// 把这个文件拷贝到cc03当中
		File file = new File("D:/haohao/ee02/aa.txt");
		File file1 = new File("D:/haohao/cc03/aa.txt");
		try {
			// 获得输入流对象
			in = new FileInputStream(file);
			// 获得输出流对象
			os = new FileOutputStream(file1);

			// 缓存区读写文件
			byte[] buffer = new byte[8 * 1024];
			// 先读
			int a;
			// 获得开始时间
			long beginTime = System.currentTimeMillis();
			while ((a = in.read(buffer)) != -1) {
				// 开始写
				// os.write(a);
				// 有三个参数的方法写
				os.write(buffer, 0, a);
				os.flush();// 尽量不要漏掉

			}
			// 结束的时间
			long endTime = System.currentTimeMillis();

			// 计算一下文件拷贝花费的时间,结束时间减去开始时间
			System.out.println("文件拷贝花费的时间:" + (endTime - beginTime));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 关闭流
				if (in != null) {
					in.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
