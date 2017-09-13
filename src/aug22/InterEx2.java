package aug22;

interface Inter1{
	public int getA();
}
interface Inter2{
	public int getA();
}
interface Inter3 extends Inter1,Inter2{
	public int getData();
}


public class InterEx2 implements Inter3{
	int a = 100;
	public int getA() {
		return a;
	}
	public int getData() {
		return a+10;
	}
	public static void main(String[] args) {
		InterEx2 it = new InterEx2();
		Inter1 it1 = new InterEx2();
		Inter2 it2 = new InterEx2();
		Inter3 it3 = new InterEx2();
		
		System.out.println(it.getA());
		System.out.println(it.getData());
		System.out.println(it);
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(it3);
	}
}
