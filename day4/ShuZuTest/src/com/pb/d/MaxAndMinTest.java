package com.pb.d;

public class MaxAndMinTest {
	public static int[] a = { 13, 2, 333, 40, 123 };
	/*
	 * 这个是第一次求最大值
	 * 13, 2     1 
	 * 13 333    2 
	 * 333 40    3 
	 * 333 123   4      比较4次之后把 333求了出来，
	 * 
	 * 第二次第二大值  13  2  40  123
	 * 13  2     1
	 * 13  40    2
	 * 40  123   3   比较3次之后把123的值求出来，
	 * 
	 *第三次求第三大值 13  2  40  
	 *13   2     1
	 *13   40    2 比较2次之后把40的值求出来，
	 *
	 *第四次求第四大值 13  2  40 
	 *13   2     1 比较1次之后把13的值求出来，
	 */

	public static int max;// 声明了一个变量，就是数组中最大的值

	public static void main(String[] args) {
		// a[0];a[1];a[2];a[3];a[4]{ 13, 2, 333, 40, 123 };
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			//{ 13, 2, 333, 40, 123 };
			for(int j=0;j<a.length-i-1;j++){
				if (a[j] > a[j + 1]) {
					max=a[j];
					a[j]=a[j + 1];
					a[j+1]=max;
				}
			}
		}
		System.out.println(max);
	}
	
	
/*
给三名牌手顺序发牌。
已知三名牌手：张飞、王菲和刘亦菲。将红桃3～红桃A依次发给这三名牌手。
分析：
步骤1、定义数组players存放三名牌手姓名，如代码：
String[] players = { "张飞", "王菲", "刘亦飞" };
步骤2、定义数组cards，存放红桃的13张牌，代码如下：
String[] cards = {
"红桃3", "红桃4", "红桃5", "红桃6","红桃7","红桃8",
"红桃9","红桃10", "红桃J" , "红桃Q", "红桃K","红桃A","红桃2"};
0  1  2     3
0  1  2      3  4  5     6  7  8     9  10  11      12  13
            13
 i=0;     i=1 ;   i=2;    i=3;......
 
 i%3==0   i%3==1  i%3==2  i%3==0
 
 for(int i=0;i<cards.length;i++){
 System.out.Println(players[ i%3 ]+""+cards[i]);
 }
步骤3、循环13次，依次将13张牌发给三名牌手。
说明：这里的发牌是将cards的数组元素值与players数组元素值一起打印。
注意：players数组的长度只有3，需要用%运算确保下标不超过2。
*/
}
