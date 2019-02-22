package com.pb.a;

import java.io.File;

public class ReaderFileInformationTest {
	/*
	 * getAbsoluteFile() 返回文件完整路径的File实例 
	 * getAbsolutePath() 返回文件完整路径
	 * getPath()返回文件路径字符串 
	 * getName() 返回文件名称 
	 * getParent() 返回文件父目录路径
	 * getParentFile()返回文件所在文件夹的路径
	 */
	public static void main(String[] args) {
		// 创建到D盘下的文件夹
		File file = new File("d:/haohao");
		// 希望在haohao下在创建一个文件夹
		File file2 = new File(file, "ee02");
		File file3 = new File("d:/haohao/ee02");
		// // 判断
		// if (file.exists()) {
		// System.out.println("父级别文件夹已经存在");
		// } else {
		// // 创建子级别文件夹
		// if (file2.exists()) {
		// System.out.println("ee02文件夹已经存在");
		// } else {
		// file2.mkdirs();
		// }

		// 返回文件的绝对路径

//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getAbsoluteFile());
//		System.out.println(file3.getAbsolutePath());
//		System.out.println(file3.getAbsoluteFile());
//		System.out.println(file.getPath());
//		System.out.println(file3.getPath());
//		System.out.println(file.getName());
//		System.out.println(file3.getName());
		
		System.out.println(file.getParent());
		System.out.println(file3.getParent());
		System.out.println(file.getParentFile());
		System.out.println(file3.getParentFile());

	}

}
