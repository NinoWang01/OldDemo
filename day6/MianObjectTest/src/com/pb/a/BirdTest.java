package com.pb.a;

public class BirdTest {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.name = "����";
		bird.age = 2;
		System.out.println(bird.getName() + " " + bird.getAge());

		/*
		 * �в����Ĺ��췽�����ã������ڶ���ʵ������ʱ��ֱ�Ӹ�ֵ
		 */

		Bird bird1 = new Bird("�˸�", 2);
		System.out.println(bird1.getName() + " " + bird1.getAge());

		Bird birdd = new Bird("");
		Bird birdss = new Bird(8, "");
		/*
		 * ���������أ� 1�����������ֱ���һ�� 2�������ķŻ����Ͳ�һ�� 3�������Ĳ���˳��һ�� 4�����������η����Բ�һ��
		 * 
		 * ��ô�����������������ͽз���������
		 */
		
		
		
		
		
		
		
		/*
		 *  
		 *  public static int count;//���Person��Ķ��󴴽��Ĵ���
			public String name; //����
			public char sex; //�Ա�
			public int age;  //����
			public double height;  //���
			public String type;  //�Ը�
		 */
		/*ʹ�õ�this�ؼ��֣��ڹ��췽��֮�以�����
		 * 	public Bird(String name, int age, String sex) {
				this(name, age);
				// ͬ��this�ؼ���
				this.sex = sex;
			}
			public Bird(String name, int age, String sex, String PersnalSkill) {
				this(name, age, sex);
				// ͬ��this�ؼ���
				this.PersnalSkill = PersnalSkill;
	}
		 */
		
		
		
		
		
		
		
		
		
		
		

	}


}
