package com.pb.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnterFileReWri_Test {

	public static void main(String[] args) {
		File file = new File("d:/haohao/cc03/true.txt");
		File file2 = new File("d:/haohao/cc03/hao.txt");
		try {
			// 读文件的对象
			FileReader reader = new FileReader(file);
			// 创建一个缓冲区
			BufferedReader br = new BufferedReader(reader);// 这个才是读的缓冲区
			// 被写入字符的文件对象
			FileWriter writer;
			writer = new FileWriter(file2);
			// 创建一个缓冲对象
			BufferedWriter bw = new BufferedWriter(writer);// 这个是写的缓冲区
			// 接收读取的时候的一行的内容
			String str;
			// 读一次读一行
			while ((str = br.readLine()) != null) {
				// 写一次写一行
				bw.write(str);
				bw.newLine();// 根据当前计算机的系统，添加一个合适的换行符
			}
			br.close();
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
