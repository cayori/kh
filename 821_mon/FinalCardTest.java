package jan26;

class Card4 {
	final int NUMBER;		// 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;		// 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;	
	static int height = 250;

	Card4(String kind, int num) {	
		KIND = kind;
		NUMBER = num;
	}

	Card4() {
		this("HEART", 1);
	}

	public String toString() {
		return "" + KIND +" "+ NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Card4 c = new Card4("HEART", 10);
//		c.NUMBER = 5;	// 에러!!! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}













