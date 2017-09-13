package aug23.add;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
			throw new Exception("하이");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
