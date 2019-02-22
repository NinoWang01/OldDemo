package com.pb.b;

public class WhileTest {

	/*
	 * while(条件表达式){ 代码块; } 条件表达式:的值是true或者false
	 */
	public static int i;

	public static void main(String[] args) {

		// 死循环
		// while(true){
		// System.out.println("你好吗？");
		// }
		while (i < 3) {
			System.out.println("第" + i + "次输出");
			i++;// 控制整个while的循环次数
		}
		System.out.println("密码已锁定");

	}

}
