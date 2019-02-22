package com.pb.b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		// 获得文件的路径
		File file = new File("d:/haohao/cc03/b.txt");
		// 写字符的流对象
		try {
			FileWriter fw = new FileWriter(file);
			// 源字符
			String str = "你好，2020年冬奥会，在我们国家的河北省张家口举办";
			// 循环
			fw.write(str);
			// 将输出语句换行的换行符
			fw.write("\r\n");
			// 关闭当前流
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
