package feb01;

import java.util.Arrays;
import static java.lang.System.out;
public class ArraysEx1 {

	public static void main(String[] args) {
		String[] ar = {"fill()","in","the","Arrays"};

		Arrays.fill(ar, "SunAe"); //배열의 요소들을 "SA"채운다.
		for(String n : ar)
			out.print(n+",");
		
		out.println("\n------------------------");
		Arrays.fill(ar, 1, 3, "♥");
		for(String n : ar)
			out.print(n+",");
	}
}














