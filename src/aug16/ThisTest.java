package aug16;

public class ThisTest {
	public ThisTest() {
		System.out.println("객체생성 : "+this);
	}
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		System.out.println("객체생성후 : "+tt);
	}
}
