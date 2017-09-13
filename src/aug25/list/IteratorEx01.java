package aug25.list;

import java.util.*;

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//Iterator it = list.iterator();
		
		while(list.iterator().hasNext()) {
			Object obj = list.iterator().next();
			System.out.println(obj);
		}
		
	}
}
