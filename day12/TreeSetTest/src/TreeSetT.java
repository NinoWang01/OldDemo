import java.util.Set;
import java.util.TreeSet;

public class TreeSetT {

	public static void main(String[] args) {
		// Set set1=new TreeSet();
		/*
		 * TreeSet：集合创建的两种方式 有序存储，以二叉树的形式存储数据
		 */
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(10);
		set.add(1);
//		set.add('a');
		set.add(23);

		set.add(56);
		set.add(5);

		System.out.println(set);

	}

}
