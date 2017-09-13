package aug23.add;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try{
			throw new RuntimeException("메롱");
		}catch(RuntimeException re) {
			System.out.println("RuntimeException 발생!!");
			System.out.println(re.getMessage());
		}
	}
}
