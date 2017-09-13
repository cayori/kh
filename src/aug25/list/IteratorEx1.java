package aug25.list;

import java.util.*;
import static java.lang.System.out;

public class IteratorEx1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);
		
		v.add("혜리");
		v.add("수지");
		v.add("설현");
		out.println("벡터크기 : "+v.size());
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			out.println(it.next());
			it.remove();
			out.println("벡터크기 : "+v.size());
		}
		
		
	}
}
