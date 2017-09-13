package aug17;

public class StaticTest1 {
	
	int a;
	static String s;
	
	public static void main(String[] args) {
		s = "자바의 꿈";
		StaticTest1 st = new StaticTest1();
		
		st.a = 1000;
		System.out.println("s : "+s);
	}
}
