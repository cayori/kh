package aug23;

public class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		final static int CONST = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			// static int cv = 300;
			final static int CONST=300;
		}
		System.out.println(LocalInner.CONST);
		System.out.println(InstanceInner.CONST);
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		new InnerEx1().myMethod();
	}
}
