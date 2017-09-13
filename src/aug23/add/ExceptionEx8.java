package aug23.add;

public class ExceptionEx8 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("Exception 이 발생했습니다.");
		}
	}
}
