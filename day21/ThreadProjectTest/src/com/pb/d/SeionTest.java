package com.pb.d;

public class SeionTest {

	public static void main(String[] args) {

		// 用for循环遍历
		for (SeionEnumTest enumSeion : SeionEnumTest.values()) {
			System.out.print(enumSeion + "\t");
		}
		System.out.println();

		// 创建一个枚举
		SeionEnumTest set = SeionEnumTest.SPRING;

		switch (set) {
		case SPRING:
			System.out.println("春眠不觉晓，处处闻啼鸟");
			break;
		case SUMMER:
			System.out.println("接天莲叶无穷碧，映日荷花别样红");
			break;
		case AUTUMU:
			System.out.println("停车坐爱枫林晚，霜叶红于二月花");
			break;
		case WINTER:
			System.out.println("忽如一夜春风来，千树万树梨花开");
			break;
		default:
			break;
		}

	}
}
