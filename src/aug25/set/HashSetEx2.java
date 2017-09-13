package aug25.set;

import java.util.*;

public class HashSetEx2 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"4", "2","2","3","3","4","4","4"};
		Set<Object> set = new LinkedHashSet<Object>(); // HashSet 대신 LinkedHashSet 사용
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
	}
}


