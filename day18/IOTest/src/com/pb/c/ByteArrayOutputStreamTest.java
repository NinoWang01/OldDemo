package com.pb.c;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		int a = 12, b = 24, c = 7, d = 14;

		// 字节数组输出流对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ByteArrayOutputStream baos1 = new ByteArrayOutputStream(10);
		baos.write(a);
		baos.write(b);
		baos.write(c);
		baos.write(d);
		// 转化为一个字节数组
		byte[] ts = baos.toByteArray();
		for (int i = 0; i < ts.length; i++) {
			System.out.println(ts[i]);
		}

	}

}
