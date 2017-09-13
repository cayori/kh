package jan26;

class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner{
		//어쩔수 없이 내부 클래스를 선언해야할 경우가 있다.
		// 그건 바로 내부 클래스의 멤버들 중 하나라도
		// static멤버가 있을 때이다.
		static int d = 1000;
		public void printData(){
//			System.out.println("int a : "+a);
//			System.out.println("private int b : "+b); 
			System.out.println("static int c : "+c);
		}
	}
	public static void main(String[] args) {
		//내부일 경우
		// Inner inner = new Inner();

		//외부에서 생성하는 것이라고 가정하고...
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
	}
}































