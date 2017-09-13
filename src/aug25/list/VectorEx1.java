package aug25.list;

import static	java.lang.System.out;
import			java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		out.println("::::::::: Vector 생성자 :::::::::");
		out.println("capacity : "+ v.capacity());
		out.println("size : "+v.size());
		
		// 자원추가
		v.add("박지성");
		v.add("박주영");
		v.addElement("유상철");
		v.add("박지성");
		v.add("박주영");
		v.addElement("유상철");
		v.add("박지성");
		v.add("박주영");
		v.addElement("유상철");
		v.add("박지성");
		v.add("박주영");
		v.addElement("유상철");
		
		out.println("::::::::: 요소 추가 후 :::::::::");
		out.println("capacity : "+ v.capacity());
		out.println("size : "+v.size());
		out.println();
		
		for(int i=0; i<v.size(); i++) {
			out.println(v.get(i));
		}out.println();
		
		for(String s : v)	out.println(s);
	}
}
