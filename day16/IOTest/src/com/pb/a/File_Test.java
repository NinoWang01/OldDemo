package com.pb.a;

import java.io.File;

public class File_Test {

	public static void main(String[] args) {
		// 创建到D盘下的文件夹
		File file = new File("d:/haohao");
		// 希望在haohao下在创建一个文件夹
		File file2 = new File(file, "ee02");
		// 判断
		if (file.exists()) {
			System.out.println("父级别文件夹已经存在");
		} else {
			// 创建子级别文件夹
			if (file2.exists()) {
				System.out.println("ee02文件夹已经存在");
			} else {
				file2.mkdirs();
			}

		}

	}

}
