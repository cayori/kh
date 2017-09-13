package aug23.pkg;

//import myPack.p1.MyPackOne;
import myPack.p1.MyPackTwo;

public class MyPackTest {
	public static void main(String[] args) {
		myPack.p1.MyPackOne myOne = new myPack.p1.MyPackOne();
		myOne.one();
		MyPackTwo myTwo = new MyPackTwo();
		myTwo.two();
	}
}
