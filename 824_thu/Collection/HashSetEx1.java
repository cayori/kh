package feb01;

import java.util.*;
import static java.lang.System.out;

public class HashSetEx1 {
    public static void main(String args[]) {
		String[] str = {"Java","Beans","Java","XML"};
      
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for (String n : str){
          if (!hs1.add(n))
              hs2.add(n);//"Java"
		}
		out.println("hs1 : " + hs1); //"Java","Beans","XML"
		hs1.removeAll(hs2);  
		out.println("hs1 : " + hs1);//"Beans","XML"
		out.println("hs2 : " + hs2);//"Java"
    }
}










