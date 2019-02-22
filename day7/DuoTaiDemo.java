/**
 * 多态环境下对成员方法的调用
 */
package com.chinasofti.ch11.model1;

class Fu {

	void show() {

		System.out.println("fu show");

	}
}

class zi extends Fu {

	void show() {

		System.out.println("zi show");
	}
}

public class DuoTaiDemo {

	public static void main(String[] args) {

		Fu f = new zi();
		f.show();//调用的是子类中的方法
	}

}
