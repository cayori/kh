package javaFundamental;

public class RandTest {
	
	public static void main(String[] args) {
		double a;
		double b = 0;
		int count = 0;
		
		a = Math.random();
		while(a != b) {
			b = Math.random();
			System.out.print(count++);
		}
		
		//System.out.print(count);
	}
	
}
