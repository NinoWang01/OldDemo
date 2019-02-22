package com.pb.a;

import java.io.File;

public class FileTestTest {
	public static void main(String[] args) {
		// 在计算机盘符下创建一个文件夹
		// 获得File的实例,方式1
		File file = new File("d:/haohao");
		// 获得File的实例,方式2
		// File file=new File("d:\\haohao");

		// 本身知道，盘符下，没有这个文件夹
		// file.mkdirs();
		// 判断
		if (file.exists()) {
			System.out.println("文件夹已经存在");

		} else {
			file.mkdir();
		}
		
		if(file.exists()){
			file.delete();
			System.out.println("文件夹已经成功删除");
		}else{
			System.out.println("文件夹不存在");
		}
	}

}
