package javaFundamental;

public class ThisExam {
	int a = 100;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		ThisExam tt = new ThisExam();
		tt.setA(1000);
		System.out.println(tt.a);
	}
}
