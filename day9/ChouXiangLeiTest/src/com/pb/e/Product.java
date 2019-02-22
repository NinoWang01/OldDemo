package com.pb.e;

public interface Product extends KindPlane {
	/*
	 * 在接口中声明属性，要赋初值
	 */
	public static String kind = "";
	public static int price = 0;

	void productTest();

}
