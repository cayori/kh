package javaFundamental;

import java.util.StringTokenizer;

public class StringTokenExam1 {
	StringTokenizer st;
	
	public StringTokenExam1(String str) {
		System.out.println("str : "+str);
		st = new StringTokenizer(str);
	}
	public StringTokenExam1(String str, String delim) {
		System.out.println("str : "+str);
		st = new StringTokenizer(str, delim);
	}
	
	public void print() {
		System.out.println("Token count : "+ st.countTokens());
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("================================");
	}
	
	public static void main(String[] args) {
		
		StringTokenExam1 st1 = new StringTokenExam1("Happy day");
		st1.print();
		
		StringTokenExam1 st2 = new StringTokenExam1("2014/05/05", "/");
		st2.print();
	}
	
}
