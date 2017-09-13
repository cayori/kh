package aug23.pkg;

import static java.lang.System.out;

public class ThrowsEx1 {
	
	public void setData(String n) throws NumberFormatException{
		if(n.length() >=1) {
			String str = n.substring(0,1);
			printData(str);
		}
	}
	
	private void printData(String n) throws NumberFormatException{
		int dan = Integer.parseInt(n);
		out.println(dan+" 단");
		out.println("-----------");
		for(int i=0; i<9; i++)
			out.println(dan+" * "+i+" : "+dan*(i+1));
	}
	
	
	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();
		try {
			t1.setData(args[0]);
		}catch(NumberFormatException ne) {
			out.println("숫자가 아닙니다");
		}catch(ArrayIndexOutOfBoundsException ae) {
			out.println("배열 오류");
		}
		
	}
}
