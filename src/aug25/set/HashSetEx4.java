package aug25.set;

import java.util.*;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

//		Person d = new Person("David",10);
//		Person e = new Person("David",10);
//		
//		System.out.println(d.equals(e));
		
		
		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}else
			return false;
	}

	public String toString() {
		return name + ":" + age;
	}
}
