package jan22;

//this : 자기자신.....객체를 의미
class ThisTest {

	public ThisTest(){
		System.out.println("객체생성 : "+this);
	}
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		System.out.println("객체생성 후 : "+tt);
	}
}
