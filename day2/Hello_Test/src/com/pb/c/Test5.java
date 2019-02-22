package com.pb.c;

public class Test5 {
	public static int a = 2;
	public static int b = 3;
	public static int c = 1;
	public static int d = 4;
	public static int e = 30;
	public static int f = -30;

	// && || ++ -- 
	public static void main(String[] args) {
		// hao();
		// System.out.println("sdfg");
		nextHao();
	}

	public static void hao() {
		if (a > b && c < d) {// && 要求两边的条件都成立，才会进入if语句内部
			System.out.println("条件成立时输出  &&  ");
		}
		if (a > b || c < d) {// || 要求两边的条件有一个成立，条件都成立
			System.out.println("条件成立时输出  ||  ");
		}
	}

	public static void nextHao() {
		/*
		 * ++a :在变量前的时候，a要先自身+1 ，然后再参与表达式的运算 a++ :在变量之后的时候，a要先参与表达式的运算，然后再自身+1；
		 * --b :在变量前的时候，b要先自身-1 ，然后再参与表达式的运算 b-- :在变量之后的时候，b要先参与表达式的运算，然后再自身-1；
		 */
		// ++a;//a=2 b=3
		// System.out.println(a);
		// a++;
		// System.out.println(a);
		// // int ff = ++a + b;
		// int hh=a++ + b;
		// System.out.println(hh);
		// System.out.println(a);

		// b--;
		// System.out.println(b);
		// --b;
		// System.out.println(b);
		// int gg = b - a;
		// System.out.println(gg);
		/*
		 * a = 2;b = 3; c = 1; d = 4; e = 30; f = -30;
		 * 
		 * rr:7
		 * a: 3  
		 * b:2
		 * c:1
		 * 
		 * uu:31
		 * e:29
		 * d:3
		 * c:2
		 * b:3
		 */
		int rr = ++a + b-- + c;
		System.out.println(rr+"\t"+a+"\t"+b+"\t"+c);
		int uu = e-- - --d + ++c + b++;
		System.out.println(uu +"\t"+e+"\t"+d+"\t"+c+"\t"+b);
	 

	}

}
