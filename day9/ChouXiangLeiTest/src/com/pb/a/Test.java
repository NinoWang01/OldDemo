package com.pb.a;

public class Test {

	public static void main(String[] args) {

		Car car =new Car();
		//��̬���е�����ת��
		Jeep jeep = new Jeep();
		car=jeep;
		
		
		RedFlag redFlag = new RedFlag();
		car=redFlag;
		
		
		run(car);	
	}

	// ��������
	public static void run(Car ca) {
		/*
		 * Car car������Ǵ������Ĳ���Ŷ���ͣ�
		 */
		if (ca instanceof Jeep) {
			
			Jeep jeep = (Jeep) ca;
			
			jeep.run();
		}else{
			System.out.println("�������Ĳ���Ŷ������RedFlag��ʵ��");
		}

	}

}
