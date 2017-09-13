package aug28;

import java.util.Arrays;
import static java.lang.System.out;

public class ArraysEx2 {
	public static void main(String[] args) {
		String[] ar1 = {"fill()","in","the","Arrays"};
		String[] ar2 = {"fill()","in","","Arrays"};
		
		if(!Arrays.deepEquals(ar1, ar2))
			out.println("두 배열이 다릅니다.");
		out.println("--------------------------------");
		
		Arrays.fill(ar2, 2,3, "the");
		if(!Arrays.deepEquals(ar1, ar2))
			out.println("두 배열이 다릅니다.");
		else
			out.println("두 배열이 같습니다.");
	}
}
