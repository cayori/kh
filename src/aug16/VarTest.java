package aug16;

public class VarTest {
	public void argTest(String ... n) {
		for(int i=0; i<n.length; i++) {System.out.println("n["+i+"] : "+i);}
		System.out.println("===========================");
	}
	public static void main(String[] args) {
		VarTest vt = new VarTest();
		vt.argTest("VarArgs", "Test");
		vt.argTest("100", "500", "600", "800", "1000");
		vt.argTest();
	}
}
