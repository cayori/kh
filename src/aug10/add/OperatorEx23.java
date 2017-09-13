package aug10.add;

public class OperatorEx23 {
	public static void main(String[] args) {
		if(10 == 10.f) {
			System.out.println("10과 10.0f 는 같다");
		}
		if('0' != 0) {
			System.out.println("'0'과 0은 같지 않다.");
		}
		if('A' == 65) {
			System.out.println("\"A\"와 65는 같다.");
		}
		
		int num = 5;
		if(num>0 && num<9) {
			System.out.println(num+"는 0보다 크고 9보다 작다");
		}
	}
}
