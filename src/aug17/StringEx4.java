package aug17;
import java.lang.String;

public class StringEx4 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
		String s2 = new String("KWON SUN AE");
		String msg = null;	// 아무것도 없는 메모리 영역확보만 되는 상태 
		String msg2 = "";	// 기본 String 생성자 등등은 다 구동이 되고, 데이터만 빈 상태
		
		if(s1.equals(s2))	msg = "s1과 s2는 내용이 같다";
		else				msg = "s1과 s2는 내용이 다르다";
		
		System.out.println(msg);
		
		if(s1.equalsIgnoreCase(s2))	msg = "s1과 s2는 대/소문자 구별없이 같다.";
		else						msg = "s1과 s2는 대/소문자 구별없이도 다르다.";
		
		System.out.println(msg);
		
		msg = String.format("%s, %20s", s1,s2);
		System.out.println("msg : "+msg);
	}
}
