package com.pb.c;

public class Test1 {

	// forѭ����Ƕ��

	public static void main(String[] args) {
		hao();
	}

	public static void hao() {
		for (int i = 5; i >0 ; i--) {
			//����ո�
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			//���*
			for (int j = 0; j <2*i-1; j++) {
					System.out.print("*");
			}
		
	
			System.out.println();
		}

	}

}
