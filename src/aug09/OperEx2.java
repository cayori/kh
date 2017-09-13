package aug09;

public class OperEx2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		// 00001010
		// 00000111
		int c = a&b;
		System.out.println("변수 c 의 값 : "+c);
		// 00000111
		c = a|b;
		System.out.println("변수 c 의 값 : "+c);
		// 00001111
		c = a^b;
		System.out.println("변수 c 의 값 : "+c);
		// 00001101
	}
}
