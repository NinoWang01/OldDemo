import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {
	// 修改重写的compare方法
	public static void main(String[] args) {

		/*
		 * 
		 */
		TreeSet<Person> set = new TreeSet<Person>();

		set.add(new Person("jack", 21));
		set.add(new Person("tom", 19));
		set.add(new Person("tomandros", 19));
		set.add(new Person("ros", 25));
//		System.out.println(set);

		Iterator it = set.iterator();
		 

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}
}
