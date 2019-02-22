/**
 * 多态环境下对成员变量的调用
 */
package com.chinasofti.ch11.model1;

class Fu {

	 int num = 3;
}

class zi extends Fu {

	 int num = 4;
}

public class DuoTaiDemo2 {

	public static void main(String[] args) {

		Fu f = new zi();
		System.out.println(f.num);// 调用的是父类中的变量
	}

}
