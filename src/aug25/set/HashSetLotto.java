package aug25.set;

import java.util.*;

public class HashSetLotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		System.out.println(set);
		
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
