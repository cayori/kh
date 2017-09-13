package aug16;

public class OverloadingTest2 {
	public static void main(String[] args) {
		OverloadingTest2 ot = new OverloadingTest2();
		ot.getLength(100);
		ot.getLength(3.14f);
		ot.getLength("100");
	}
	
	public void getLength(int i) {
		String a = String.valueOf(i);
		getLength(a);
	}
	public void getLength(float f) {
		String a = String.valueOf(f);
		getLength(a);
	}
	public void getLength(String str) {
		System.out.println(str.length());
	}
}
