package com.pb.b;

public class BiaoJiTiaoChu {

	public static void main(String[] args) {

		/*
		 * ���һ�����,��j=1��ʱ������ѭ��
		 *  ��0�ε����	��1�ε����	��2�ε����	
			��0�ε����	��1�ε����	��2�ε����	
			��0�ε����	��1�ε����	��2�ε����
				
			��0�ε����	��0�ε����	��0�ε����
		 * loop:��  ������  +  �����
		 * ��������ѭ����������Ƕ�׵�ѭ��
		 * 
		 */
		
		
		loop:	
			
		for (int i = 0; i < 3; i++) {
			
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print("��"+j +"�ε����"+ "\t");
				
				continue loop;//��j=1��ʱ���������˱�ǵ�λ��
			}
			System.out.println();
			
			
		}
		
		
		

	}

}
