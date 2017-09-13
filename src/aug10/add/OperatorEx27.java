package aug10.add;

public class OperatorEx27 {
	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		
		int absX = (x>=0) ? x : -x;
		int absY = (y>=0) ? y : -y;
		
		System.out.println("x = 10 일때 x 의 절대값은 "+x);
		System.out.println("y = -10 일때 y 의 절대값은 "+x);
	}
}
