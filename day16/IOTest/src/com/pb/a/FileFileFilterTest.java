package com.pb.a;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFileFilterTest {
	public static void main(String[] args) {
		File file = new File("d:/haohao/ee02");

		// 这种写法，可以先这么用
		// File[] file2 = file.listFiles(new FileFilter() {
		// @Override
		// public boolean accept(File pathname) {
		// //过滤的是文件，
		// return pathname.isFile() && pathname.getName().endsWith("java");
		// }
		// });
		//过滤文件夹
		File[] file2 = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {

				return dir.isDirectory()&&name.equals("cc03");
			}
		});
		for (int i = 0; i < file2.length; i++) {
			System.out.println(file2[i].getName());
		}

	}
}
