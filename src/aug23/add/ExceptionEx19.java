package aug23.add;

public class ExceptionEx19 {
	public static void main(String[] args) throws Exception{
		method1();
	}
	
	static void method1() throws Exception{
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1() 에서 예외처리");
		//	e.printStackTrace();
			throw e;
		}
	}
}
