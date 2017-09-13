package aug10.add;

public class OperatorEx6 {
	public static void main(String[] args) {
		byte b = 10;
		byte result = (byte)~b;
		
		System.out.println("b = "+b);
		System.out.println("~b = "+result);
		
		System.out.println("b = "+Integer.toBinaryString(b));
		System.out.println("~b = "+Integer.toBinaryString(result));
	}
}
