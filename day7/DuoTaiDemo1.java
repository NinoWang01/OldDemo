/**
 * 多态环境下对静态成员方法的调用
 */
package com.chinasofti.ch11.model1;

class Fu {

	static void show() {

		System.out.println("fu show");

	}
}

class zi extends Fu {

	static void show() {

		System.out.println("zi show");
	}
}

public class DuoTaiDemo1 {

	public static void main(String[] args) {

		Fu f = new zi();
		f.show();//调用的是父类中的方法
	}

}
