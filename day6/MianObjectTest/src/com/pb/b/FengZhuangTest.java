package com.pb.b;

public class FengZhuangTest {

	public static void main(String[] args) {
		FengZhuang fz = new FengZhuang();
		// 具体指向某一个实例化对象
		fz.setAge(23);
		fz.setName("国境");
		/*
		 * 把自己的信息写成一个封装类
		 */

		/*
		 * new FengZhuang().hao();JVM 会认为，
		 * 这样做没有任何意义 直接给你回收掉，
		 * 垃圾对象最大的特点：就是没有引用变量
		 */
		FengZhuang ff = new FengZhuang();
		String ss = new FengZhuang().hao();
		
		
	}

}
