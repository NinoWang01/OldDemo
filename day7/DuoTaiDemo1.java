/**
 * ��̬�����¶Ծ�̬��Ա�����ĵ���
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
		f.show();//���õ��Ǹ����еķ���
	}

}
