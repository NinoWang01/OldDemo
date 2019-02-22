package com.pb.c;

public class HaoTest extends NeiBuLeiTest {

	public static void main(String[] args) {
		// 创建一个内部类对象,内部类对象的实例化
		NeiBuLeiTest.Hao nbth = new NeiBuLeiTest().new Hao();
		nbth.age = 23;
		nbth.name = "张三丰";
		nbth.a=12;
		nbth.hhh();
		nbth.shuChu();
	}

	/*
	 * People 外部类 Doctor 内部类 
	 * 要求：内部类中写医生的属性和行为 
	 * 在测试类中输出（调用内部列的方法输出）
	 */

}
