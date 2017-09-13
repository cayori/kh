package javaFundamental;

public class StringBufferExam1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = sb1.append(" & study");
		
		String msg = null;
		
		if(sb1 == sb2)	{msg = "sb1 과 sb2 는 같다";}
		else			{msg = "sb1 과 sb2 는 다르다";}
		
		System.out.println(msg);
		
		msg = sb1.toString();
		System.out.println("sb1 : "+msg);
		msg = sb2.toString();
		System.out.println("sb2 : "+msg);
		
	}
}
