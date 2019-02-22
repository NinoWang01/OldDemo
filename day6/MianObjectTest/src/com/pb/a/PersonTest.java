package com.pb.a;

//测试类
public class PersonTest {

	/*
	 * 函数入口，本身就是静态
	 * 
	 * @param args static：作为修饰,修饰谁，谁就是静态的
	 */
	public static int a = 1;

	public static void main(String[] args) {
		// 实例化一个对象
		Person p = new Person();
		// 让p具体化指向一个个体
		p.name = "张三丰";
		p.age = 110;
		p.sex = "男";

		System.out.println("名字：" + p.getName() + " " + "性别：" + p.getSex() + " "
				+ "年龄：" + p.getAge());

	}

	// 修饰方法
	static  {
		System.out.println("我是主函数中的静态代码块,来自PersonTest");

	}

}
