package aug23;

//import static java.lang.System.out;

interface TestInter{
	int data = 10000;
	public void printData();
}

public class AnonyInner {
	public void test() {
		new TestInter() {
			public void printData() {
				System.out.println("data : "+data);
			}
		}.printData();
	}
	
	public static void main(String[] args) {
		new AnonyInner().test();
	}
}
