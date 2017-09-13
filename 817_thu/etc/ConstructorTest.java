package jan22;

class Data11 {
	int value;
}

class Data22 { 
	int value;
	Data22(int x) { 	// 매개변수가 있는 생성자.
		value = x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data11 d1 = new Data11();
		Data22 d2 = new Data22();		// compile error발생
	}
}