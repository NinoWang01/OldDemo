package com.pb.b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInOutTest {

	public static InputStream is;
	public static OutputStream os;

	public static BufferedInputStream bis;
	public static BufferedOutputStream bos;

	public static void main(String[] args) {
		try {
			is = new FileInputStream("d:/haohao/cc03/a.txt");
			// 创建缓冲输入流
			bis = new BufferedInputStream(is);
			os = new FileOutputStream("d:/haohao/cc03/b.txt");
			// 缓冲输出流对象
			bos = new BufferedOutputStream(os);
			// 循环
			int len;
			while ((len = bis.read()) != -1) {
				// 读到的内容写到另一个文件中
				bos.write(len);
			}
			
			bos.close();
			bis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			try {
//				if (bos!= null) {
//					bos.close();
//				}
//				if (bis != null) {
//					bis.close();
//				}
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}

	}
}
