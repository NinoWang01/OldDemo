package com.pb.c;


import java.util.Arrays;

public class Test2 {

	/*
	 * 声明定义了一个一维数组,
	 * 需要用[]来限定。
	 * 
		定义格式(1)
		类型[ ]  数组变量名；
		示例：int[ ]  scores;
		
		定义格式(2)
		类型  数组变量名[ ];
		int a [ ];
		这种定义格式是C语言的风格，目的是兼容C语言的语法格式。不建议使用这种定义方式。
		
		定义格式(3)
		类型[ ]  数组变量名=new 类型[数组容量];//限定数组的长度
		示例：int[ ]  scores=new  int[5]; 
	 */
	public static int[] array_list = new int[5];

	public static void main(String[] args) {
		array_list[0] = 12;
		array_list[1] = 34;
		array_list[2] = 6;
		array_list[3] = 2;
		array_list[4] = 657;

		// 数组提供的一个排序方法
		Arrays.sort(array_list);
		for (int i = 0; i < array_list.length; i++) {
			System.out.println(array_list[i]);
		}

		String ss = Arrays.toString(array_list);

		System.out.println(ss);

	}
}
