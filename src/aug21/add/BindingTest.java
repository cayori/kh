package aug21.add;

class Parent5{
	int x = 100;
	
	public void method() {
		System.out.println("Parent Class");
	}
}
class Child5 extends Parent5{
	int x = 200;
	
	public void method() {
		System.out.println("Child Class");
	}
}


public class BindingTest {
	public static void main(String[] args) {
		Parent5 p = new Child5();
		Child5 c = new Child5();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
	}
}
