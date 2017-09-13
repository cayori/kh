package feb01;


import static java.lang.System.out;
import java.util.Vector;

class VectorEx1{

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>(2,5);
		
		out.println("::::::::::::Vector생성시:::::::::::::");
		out.println("capacity : "+v.capacity ()); //2
		out.println("size : "+v.size ()); //0

		//자원추가
		v.add("박지성");
		v.add("박주영");
		v.addElement("유상철");

		out.println("::::::::::::요소 추가후::::::::::::::");
		out.println("capacity : "+v.capacity ()); //7
		out.println("size : "+v.size ()); //3
	}
}












