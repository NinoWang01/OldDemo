package com.pb.a;

public class YiWeiShuZu {
	/*
	 * 一位数组的声明定义 int:数组的类型 []：必不可少 a：数组的引用名不可少
	 */
	public static int[] a;
	/*
	 * 这种定义格式是C语言的风格 ，目的是兼容C语言的语法格式。 不建议使用这种定义方式。
	 */
	public static int b[];
	/*
	 * 创建数组的方式三： new int[5]:创建了一个数组对象 [5]：给数组放了5个元素，但是五个元素不具体
	 * 计算机：JVM虚拟机，给五个元素默认赋值
	 * 
	 * 初始化未赋值的数组元素规则： int 整数类型初始化为0; double 浮点类型初始化为0.0； char
	 * 字符类型初始化为unicode码为1的字符； boolean 类型初始化为false； String 类型初始化为null。
	 */

	public int[] c = new int[5];

	// public String[] d = new String[5];

	/*
	 * 给数组动态赋值
	 * 
	 * new int[]{1,2,3,4,5}：也就是在创建数组对象的时候， 通过大括号来动态给每一个元素赋值
	 */
	public static int[] f = new int[] { 1, 2, 3, 4, 5 };

	/*
	 * 给数组静态赋值： { 10, 20, 30, 40, 50}:通过这种方式静态给数组赋值 静态赋值：一般都放在类下，作为全局变量来用
	 */
	public static int[] g = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		/*
		 * 数组里 f.length：指的是数组的长度，
		 * 只有length这个属性，
		 *  没有length（）这个方法 
		 *  String :
		 * 即有length这个属性， 也有length（）这个方法
		 */
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}

		/*
		 * 动态创建数组
		 *  print(new int[] { 55, 88, 72 })：
		 * 作为一个方法的参数
		 * //int[] scores=new int[] { 55, 88, 72 }
		 */
		print(new int[] { 55, 88, 72 });

	}

	public static void hao() {
		// 动态赋值的数组，可以直接在声明的地方使用
		int[] h = new int[] { 1, 2, 3, 4, 5 };

	}

	
	public static void print(int[] scores) {
		// 打印数组scores中各元素的值
	}

}
