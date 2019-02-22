package com.pb.b;

public class JiSuanQi {
	public double a;
	public double b;
	public double c;

	// 加法运算
	public double jia(double a, double b) {

		c = a + b;
		System.out.println(c);
		return c;

	}

	// 减法
	public double jian(double a, double b) {

		c = a - b;
		System.out.println(c);
		return c;

	}

	// 乘法
	public double cheng(double a, double b) {

		c = a * b;
		System.out.println(c);
		return c;

	}

	// 除法

	public double chu(double a, double b) {

		if (b == 0) {
			System.out.println("分母不能为零");

		}
		if (b != 0) {
			c = a / b;
			System.out.println(c);
		}

		return c;

	}

}
