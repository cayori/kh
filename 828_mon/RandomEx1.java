package feb01;

import java.util.Random;
import static java.lang.System.out;
class RandomEx1 {
	public static void main(String[] args) 	{
		String[] lesson = {"Java Beg","JSP","XML&Java","EJB"};
		Random r1 = new Random();
		
		int index = r1.nextInt(4);
		
		out.println("선택과목 :"+lesson[index]);
	}
}
