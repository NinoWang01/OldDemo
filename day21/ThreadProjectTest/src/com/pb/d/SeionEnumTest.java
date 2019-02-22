package com.pb.d;

public enum SeionEnumTest {
	// 添加枚举
	SPRING("春天"), SUMMER("夏天"), AUTUMU("秋天"), WINTER("冬天");
	// 构造方法
	String name;

	/*
	 * 枚举类类中构造方法的修饰符
	 * 可以使private ，不能是public、default、protected
	 */
	  SeionEnumTest(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
