public abstract class Person {

	/*
	 * û�о���ʵ�֣����Ҳ���Ҫ����ʵ�֣�
	 * 
	 * �г��󷽷�����һ���ǳ����࣬���ǶԵ�
	 * 
	 * ������һ���г��󷽷� �� ���Ǵ��
	 */
	// public void eat() {
	//
	// System.out.println("С���Է��ķ�ʽÿ��12�����Է�");
	// }

	abstract int eat();// ���󷽷�û�з�����

	abstract int sleep(int a);

	abstract int speek(int a);

	abstract void huai();

	/*
	 * ��static���εķ�������������Ϊ���󷽷�
	 *  �����η�private���εķ���Ҳ��������Ϊ���󷽷���
	 *   private��������װ�õģ�
	 * final���εķ�����������Ϊ���󷽷�
	 * 
	 * 
	 */
	abstract void hao();

}
