package com.pb.c;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {

	public static void main(String[] args) {

		// 创建一个字节数组
		byte[] ss = { 12, 24, 7, 14 };
		// 创建ByteArrayInputStream 包含一个内部缓冲区对象
		ByteArrayInputStream bais = new ByteArrayInputStream(ss);
		// 依次从字节数组输入流中读取字节
		int a = bais.read();
		System.out.println(a);
		int b=bais.read();
		System.out.println(b);
	}

}
