package com.pb.c;

import java.io.*;

/*
 * 字节流到字符流的转化
 * 
 */
public class ZiJieToZiFuTest {
	// 字节流输入流对象
	public static FileInputStream fis = null;
	// 字节流输出对象
	public static FileOutputStream fos = null;
	// 字节流输入流对象转化到字符流输入流对象
	public static InputStreamReader isr = null;
	// 字节流输出流对象转化到字符流输出流对象
	public static OutputStreamWriter isw = null;
	// 字符流读缓冲区
	public static BufferedReader br = null;
	// 字符流写缓冲区
	public static BufferedWriter bw = null;
	public static void main(String[] args) {
		// 文件对象
		File file = new File("d:/haohao/new/one.txt");
		File file2 = new File("d:/haohao/new/two.txt");
		try {
			// 把文件对象交给字节输入流对象
			fis = new FileInputStream(file);
			// 从输入字节到输入字符
			isr = new InputStreamReader(fis,"gbk");
			// 先交给字符流读缓冲区
			br = new BufferedReader(isr);
			// 把要写入字符的文件对象交给字节输入流对象
			fos = new FileOutputStream(file2);
			// 从输出字节到输出字符
			isw = new OutputStreamWriter(fos,"gbk");
			// 把字符输出流对象交给字符流写缓冲区
			bw = new BufferedWriter(isw);
			// 写文件
			String len;
			// 这里是读
			while ((len = br.readLine()) != null) {
				// 这里是写
				bw.write(len);
				bw.newLine();
			}

			bw.close();
			br.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
