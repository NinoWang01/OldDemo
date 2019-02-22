package com.pb.a;

public class Test1 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		// 行数
		int row = 10;
		// 列数
		int col = 10;
		while (true) {
			if (i > row && j > col) {
				break;// 超出边界跳出
			}
			if (i < row && j > col) { // 如果列超出边界，行没超出，则换行
				System.out.println("");
				j = 0;// 列从0开始重新计数
				i++;
//				continue;

			}
			if (i < row && j < col) {// 行列都在边界内
				if (j > i && j < row - i) {
					System.out.print("*");// 如果列大于等于行并且，小于边界-行时画*
				} else {
					System.out.print(" ");
				}
			}

			j++;

		}
	}
}
