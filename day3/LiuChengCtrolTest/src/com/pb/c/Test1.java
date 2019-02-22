package com.pb.c;

public class Test1 {

	// for循环的嵌套

	public static void main(String[] args) {
		hao();
	}

	public static void hao() {
		for (int i = 5; i >0 ; i--) {
			//输出空格
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			//输出*
			for (int j = 0; j <2*i-1; j++) {
					System.out.print("*");
			}
		
	
			System.out.println();
		}

	}

}
