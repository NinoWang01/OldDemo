package com.pb.c;

public class NeiBuLeiTest {
	public int a;
	public String b;

	/*
	 * 内部类：在类的内部，定义了一个新的类
	 */

//	public static void main(String[] args) {
//
//		// 创建一个内部类对象,内部类对象的实例化
//		NeiBuLeiTest.Hao nbth = new NeiBuLeiTest().new Hao();
//		nbth.age=23;
//		nbth.name="张三丰";
//		nbth.shuChu();
//
//	}

	/*
	 * Hao:就符合内部类的定义，Hao就是内部类
	 */
	public class Hao  extends NeiBuLeiTest{
		public int age;
		public String name;

		public void shuChu() {
			System.out.println("姓名：" + age + "\t" + "年龄：" + name);
		}

		@Override
		public void hhh() {
			super.hhh();
		}
 
	}
	
	public void hhh(){
		System.out.println("我是外部类的方法");
	}
	
	
	
	
	

}
