/**
 * ��̬�����¶Գ�Ա�����ĵ���
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
		f.show();//���õ��������еķ���
	}

}
