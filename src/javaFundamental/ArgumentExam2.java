package javaFundamental;

public class ArgumentExam2 {
	
	public void increase(int[] n) {
		for(int i=0; i<n.length; i++) {
			n[i]++;
			System.out.println("n["+i+"] : "+n[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] ref1 = {100,800,1000};
		ArgumentExam2 rp = new ArgumentExam2();
		
		rp.increase(ref1);
		
		for(int i=0; i<ref1.length; i++) {
			System.out.println("ref1["+i+"] : "+ref1[i]);
		}
	}
}