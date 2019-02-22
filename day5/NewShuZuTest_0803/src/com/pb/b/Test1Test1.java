package com.pb.b;

public class Test1Test1 {
	public static String str = "学习Android开发难不难";
	public static String s1 = "abcgdefghgjkgl";
	public static String s2 = "123456789";
	public static String s3 = "123456789";

	public Object obj;

	/*
	 * String(String original)
	 * 
	 * String s1=new String("你睡着了没？"); 创建了几个对象？ s1：引用对象 new
	 * String("你睡着了没？")："你睡着了没？"
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
	 *1、生活真的很美好，你要加油奥!!! 截取字符串
	 *             
	 * String  s1="生活是的吗真的很不错美好，你要真的是的加油奥！！！"
	 * 截取完后   +  用加号作为连接符
	 *2、替换字符串
	 *String s3="http";所有的a替换掉
	 *String s2="macjadhsfhafw";
	 *顺道输出字符 f 首次出现的位置下标
	 * 
	 * ①、charAt(int index)  : 返回指定索引处的char值
	   ②、isEmpty()   :当且仅当length（）为0时返回true
       ③、indexOf（‘a’）:返回a首次出现位置处字符a的索引，indexOf（“sdf”）: 返回指定字符串在此字符串中第一次出现处的索引。
       ④、length（）：返回此字符串的长度
       ⑤、replace（被替换字符串，替换字符串） 修改字符串串的内容
       ⑥、toString（）：返回此对象本身它已经是一个字符串：Integer.valueOf(aa).toString()+1
       ⑦、substring（0,5）：指的是从原有字符串中截取出来一个新的字符串，它的截取从0~字符串的4为止
       ⑧、String字符串在堆和栈中的情况
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
