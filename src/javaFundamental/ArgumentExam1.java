package javaFundamental;

public class ArgumentExam1 {
	
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		ArgumentExam1 vp = new ArgumentExam1();
		int var2 = vp.increase(var1);
		
		System.out.println("var1 : "+var1+", var2 : "+var2);
	}
}
