package com.pb.b;

public class JiSuanQi {
	public double a;
	public double b;
	public double c;

	// �ӷ�����
	public double jia(double a, double b) {

		c = a + b;
		System.out.println(c);
		return c;

	}

	// ����
	public double jian(double a, double b) {

		c = a - b;
		System.out.println(c);
		return c;

	}

	// �˷�
	public double cheng(double a, double b) {

		c = a * b;
		System.out.println(c);
		return c;

	}

	// ����

	public double chu(double a, double b) {

		if (b == 0) {
			System.out.println("��ĸ����Ϊ��");

		}
		if (b != 0) {
			c = a / b;
			System.out.println(c);
		}

		return c;

	}

}
