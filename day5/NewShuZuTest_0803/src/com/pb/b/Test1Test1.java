package com.pb.b;

public class Test1Test1 {
	public static String str = "ѧϰAndroid�����Ѳ���";
	public static String s1 = "abcgdefghgjkgl";
	public static String s2 = "123456789";
	public static String s3 = "123456789";

	public Object obj;

	/*
	 * String(String original)
	 * 
	 * String s1=new String("��˯����û��"); �����˼������� s1�����ö��� new
	 * String("��˯����û��")��"��˯����û��"
	 */
	public static void main(String[] args) {

		/*
		 * str:14 s1:11 s2:9
		 */
		// System.out.println(str.charAt(5));
		// System.out.println(s1.charAt(5));
		// System.out.println(s2.charAt(5));
		// System.out.println(str.isEmpty());
		// String sss=s1.replace("efghgj", "456");
		// System.out.println(sss);
		// System.out.println(str);
		// System.out.println(s1);
		// System.out.println(s2.toString());

		// System.out.println(str.substring(3,9));
		// System.out.println(s1.substring(3,9));
		// System.out.println(s2.substring(3,9));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));

	}
	
	
	
	
	
	
	
	
	/*
	 *1��������ĺ����ã���Ҫ���Ͱ�!!! ��ȡ�ַ���
	 *             
	 * String  s1="�����ǵ�����ĺܲ������ã���Ҫ����ǵļ��Ͱ£�����"
	 * ��ȡ���   +  �üӺ���Ϊ���ӷ�
	 *2���滻�ַ���
	 *String s3="http";���е�a�滻��
	 *String s2="macjadhsfhafw";
	 *˳������ַ� f �״γ��ֵ�λ���±�
	 * 
	 * �١�charAt(int index)  : ����ָ����������charֵ
	   �ڡ�isEmpty()   :���ҽ���length����Ϊ0ʱ����true
       �ۡ�indexOf����a����:����a�״γ���λ�ô��ַ�a��������indexOf����sdf����: ����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
       �ܡ�length���������ش��ַ����ĳ���
       �ݡ�replace�����滻�ַ������滻�ַ����� �޸��ַ�����������
       �ޡ�toString���������ش˶��������Ѿ���һ���ַ�����Integer.valueOf(aa).toString()+1
       �ߡ�substring��0,5����ָ���Ǵ�ԭ���ַ����н�ȡ����һ���µ��ַ��������Ľ�ȡ��0~�ַ�����4Ϊֹ
       �ࡢString�ַ����ڶѺ�ջ�е����
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
