package com.pb.d;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car("����", 100.0);
		/*
		 * ������ӿ�ָ��ʵ�������Ǹ���Ķ��� ��Ȼ���ٰ��������ö��󣬸����ĸ���ӿ�
		 */
		Motion mo = new Car("����", 150.0);
		Product pd = (Product) mo;
		Action ac = mo;
		mo.stop();
		pd.getPrice();
		ac.hhh();
 
	}
	/*
	 * Ҫ��
	 * �ɻ�    ���ӿڣ�  KindPlane   
	 * Motion �ӽӿ�   ��ʾ����
	 * Product �ӽӿ� ��ʾƷ��
	 * дһ���࣬Plane  ͬʱʵ��Motion��Product�������ӿ�
	 * �����࣬�ڲ������У�Plane ��ʵ���������ܹ����ɫת��
	 * �ֱ���ò�ͬ�ķ���
	 */
	
	
	
	
	
	
	
	
	
	
	
}
