package jan22;

class StaticTest1{

	int a; //instance/멤버변수
	static String s; //클래스변수
	
	public static void main(String[] args){
		s = "자바의 꿈"; //객체생성없이 사용할 수 있다.... 
		                 //같은 클래스에서의 호출이기때문에 
						//클래스명.변수명으로 호출 안해도 된다.
		StaticTest1 st1 = new StaticTest1();

		//a = 1000; //오류
		st1.a = 1000;
		System.out.println("s : " + s);
	}
}
