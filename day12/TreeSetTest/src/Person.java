import java.util.*;

/*
 * 
 */
public class Person implements Comparable{
	public int age;
	public String name;
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	public int compareTo(Object p1) {
		
		Person p3 = (Person) p1;
		
		if (this.age - p3.age > 0) {
			return 1;
		}
		if (this.age - p3.age == 0) {
			
			return this.name.compareTo(p3.name);//名字的大小
			
		}
		return -1;
	}

	public String toString() {
		return  name+":+"+age;
	}

}
