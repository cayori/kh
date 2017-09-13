package aug25.set;

import java.util.*;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}


class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		boolean b = false;
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			if( (name.equals(temp.name)) && (age==temp.age) )
				b = true;
		}
		return b;
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}