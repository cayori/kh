package aug25.list;

import java.util.*;

public class IteratorEx2 {
	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10; i++)
			original.add(i+"");
		
		Iterator oit = original.iterator();
		
		while(oit.hasNext()) {
			copy1.add(oit.next());
		}
		
		System.out.println("= Original 에서 copy1 로 복사(copy) =");
		System.out.println("original : "+original);
		System.out.println("copy1 : "+copy1);
		System.out.println();
		
		oit = original.iterator();
		
		while(oit.hasNext()) {
			copy2.add(oit.next());
			oit.remove();
		}
		System.out.println("= Original 에서 copy1 로 이동(move) =");
		System.out.println("original : "+original);
		System.out.println("copy1 : "+copy1);
	}
}
