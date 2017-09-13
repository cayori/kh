package jan26;

interface TestInter{
	int data = 10000;
	public void printData();
}
class  AnonyInner{

	public void test(){
		//추상클래스와 인터페이스가 자생력이 없는 이유는
		//미완성된 자원(추상메서드)이 있으므로
		//JVM이 메모리상에 어떤 형태로 자원을 배치할지 
		//모르기 때문이다.
		new TestInter(){
			public void printData()//미완성된 것을 완성하여
			{			//JVM이 확인가능하도록 해준다.
				System.out.println("data : "+data);
			}
		}.printData();
		
		/*TestInter2 tt = new TestInter2();
		tt.printData();*/

	}
	public static void main(String[] args){
		//AnonyInner ai = new AnonyInner();
		//ai.test();
		new AnonyInner().test();//익명으로 수정
	}
}

/*class TestInter2 implements TestInter{
	public void printData()//미완성된 것을 완성하여
	{			//JVM이 확인가능하도록 해준다.
		System.out.println("data : "+data);
	}
}*/






