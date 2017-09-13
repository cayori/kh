package aug25.list;

import java.util.Vector;
import static java.lang.System.out;

public class VectorEx2{
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>(2,5);
		
		// 자원추가
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.);
		
		for(Double n : v)
			out.println(n);
		
		// 자원검색
		double search = 1000.0;
		int index = v.indexOf(search);
		if(index != -1)
			out.println("검색요소 "+search+" 의 위치 :"+index);
		else
			out.println("검색요소 "+search+"가 없습니다");
		
		
		out.println("::::::::::::: 삭제 전 용량/크기 확인 :::::::::::::");
		out.println("capcity : "+v.capacity());
		out.println("size : "+v.size());
		
		//자원삭제
		search = 3.14;
		if(v.contains(3.14)) {
			v.remove(search);
			out.println(search+"삭제 완료!");
		}
		
		out.println("::::::::::::: 삭제 후 용량/크기 확인 :::::::::::::");
		out.println("capcity : "+v.capacity());
		out.println("size : "+v.size());
		
		v.trimToSize();
		out.println("::::::::::::: 정리 후 용량/크기 확인 :::::::::::::");
		out.println("capcity : "+v.capacity());
		out.println("size : "+v.size());
		
	}
}