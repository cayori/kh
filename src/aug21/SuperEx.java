package aug21;

class Parent2{
	public Parent2(int a) {
		System.out.println("Parent Class");
	}
}
class SuperEx extends Parent2 {
	public SuperEx() {
		super(1);
		System.out.println("SuperEx Class");
	}
	
	public static void main(String[] args) {
		SuperEx se = new SuperEx();
	}
}

