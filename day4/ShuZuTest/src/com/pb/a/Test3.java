package com.pb.a;

public class Test3 {
	

	
	
	
	
	

	/*
	 * һ����static���εķ������ߺ����У� ����ֱ��Ӧ��һ���Ǿ�̬�ı�����������Ҳ�к��������ߺ�����
	 */
	public static void main(String[] args) {
		Person p = new Person();
		// ���˵һ�������������ķ��������ԣ�ͨ����.����ʵ�֣����£�
		p.age = 20;
		p.setName("������");

		System.out.println(p.getName() + p.getAge());

		p.eat("");
		HaoHao hao = new HaoHao();
		hao.eat();
		hao.run();
		hao.sleep();
		hao.shit();
		// hao();
		tian(9,"retwert" );
	}

	// ������
	/*
	 * public:���η������η�����ʹ��Ȩ��
	 *  static:���η�����״̬�� 
	 *  void:ָ���Ƿ��������ǿյģ�û�У�
	 * hao���������������Ͷ��壬��ѭ���Ǳ�ʶ���������
	 *  ()��������ţ���������ܴ���һЩ���� 
	 *  {�����;}:���Ƿ��������壬ҵ���߼�������������
	 */
	/*
	 * Ҫ�󣺴���һ���࣬���dog��
	 * ������ķ����Լ��������ԣ��в������޲�������
	 * ���ԣ��ܣ��С��ԡ�age��sex��name
	 * 
	 * ����д��һ���ࣨ�����У�
	 * Ҳ����д�ɲ�ͬ����
	 * 
	 * 
	 */
	public static void hao() {
		System.out.println("����һ������");
	}

	public void huai() {
		System.out.println("����һ������");
	}

	public static void tian(int a, String s) {
		
		
		System.out.println("qwetrertsydyjuiy");

	}

}