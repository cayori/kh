package feb01;



import static java.lang.System.out;

import java.util.HashMap;
import java.util.Set;
class MapEx1{

	public static void main(String[] args) {
		String[] msg = {"Berlin","Dortmund","Frankfurt",
			"Gelsenkirchen","Hamburg"};

		HashMap<Integer,String> map = 
			new HashMap<Integer,String>();// HashMap생성

		for(int i=0 ; i<msg.length ; i++)
			map.put(i,msg[i]);//맵에 저장

		Set<Integer> keys = map.keySet();
		for(Integer n : keys)
			out.println(map.get(n)); //맵에서 읽어오기
	}
}

















