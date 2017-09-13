package javaFundamental;

public class MethodEx1 {
	int var1, var2;
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodEx1 me = new MethodEx1();
		int res = me.sum(1000, -10);
		
		System.out.println(res);
	}
}
