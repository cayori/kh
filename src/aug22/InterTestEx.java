package aug22;

interface InterTest{
	static final int a = 100;
	public abstract int getA();
}

public class InterTestEx implements InterTest{
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		InterTestEx it1 = new InterTestEx();
		System.out.println("getA() : "+it1.getA());
	}
}
