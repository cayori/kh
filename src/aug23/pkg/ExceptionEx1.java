package aug23.pkg;

import static java.lang.System.out;

class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			int[] var = {10,200,30};
			for(int i=0 ; i <= 3 ; i++)
				out.println("var["+i+"] : "+var[i]);
		}catch(Exception var){
			;
		}
		
		out.println("프로그램 끝!");
	}
}
