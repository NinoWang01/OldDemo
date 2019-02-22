public abstract class Person {

	/*
	 * 没有具体实现，而且不需要具体实现，
	 * 
	 * 有抽象方法的类一定是抽象类，这是对的
	 * 
	 * 抽象类一定有抽象方法 ， 这是错的
	 */
	// public void eat() {
	//
	// System.out.println("小明吃饭的方式每天12点整吃饭");
	// }

	abstract int eat();// 抽象方法没有方法体

	abstract int sleep(int a);

	abstract int speek(int a);

	abstract void huai();

	/*
	 * 用static修饰的方法，不能声明为抽象方法
	 *  用修饰符private修饰的方法也不能声明为抽象方法，
	 *   private它是做封装用的，
	 * final修饰的方法不能声明为抽象方法
	 * 
	 * 
	 */
	abstract void hao();

}
