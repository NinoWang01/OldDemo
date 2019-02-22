package com.pb.a;

public class Test {
	public static int a = 1;
	public static int b = 0;

	public static void main(String[] args) {
		// hao();
		System.out.println(hao());

	}

	public static int hao() {

		/*
		 * 程序代码变冗余 有效代码行，少了
		 */
		try {

			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			System.out.println("我是异常组合中finally块内容");
			return 20;
		}

		// return 0;
	}

}
