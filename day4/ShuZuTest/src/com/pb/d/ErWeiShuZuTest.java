package com.pb.d;

public class ErWeiShuZuTest {

	/*
	 * 声明数组变量定义格式(1)
	 * 
	 * 数组类型[ ][ ] 数组变量; 示例： int[][] a; 二维数组定义格式(2)
	 * 
	 * 数组类型 数组变量[][] 示例：int a[][]; 二维数组定义格式(3)
	 * 
	 * 数组类型[][] 数组变量=new 数组类型[][]; 示例：float[][] a=new float[3][];
	 * 
	 * 二维数组的数组元素是：一维数组
	 */
	public static int[][] aa;
	public static int[][] str = { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } };

	/*
	 * str[0][0] 10 str[0][1] 2 str[0][2] 3 str[0][3] 25
	 * 
	 * str[1][0] 11 str[1][1] 2 str[1][2] 23 str[1][3] 90
	 */
	// 声明了一个二维数组，长度是5，元素没有
	public static int[][] cc = new int[5][];
	public static void main(String[] args) {
		// str[0]和str[1];
/*
 * public static int[][] str = { 
 * 			{ 10, 2, 3, 25 }, 
 * 			{ 11, 2, 23, 90 } 
 * 		};
 * 一维数组：str[0]   指向{ 10, 2, 3, 25 },
 * 一位数组：str[1]   指向{ 11, 2, 23, 90 } 
 *
 */
			for (int j = 0; j < str[0].length; j++) {
				System.out.print(str[0][j] + "\t");
			}
			System.out.println();//输出语句由换行的作用
			for (int k = 0; k < str[1].length; k++) {
				System.out.print(str[1][k] + "\t");
			}
//			for (int i = 0; i < a.length; i++) {
//				//{ 13, 2, 333, 40, 123 };
//				for(int j=0;j<a.length-i-1;j++){
//					if (a[j] > a[j + 1]) {
//						max=a[j];
//						a[j]=a[j + 1];
//						a[j+1]=max;
//					}
//				}
//			}

	}

}
