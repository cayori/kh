package aug17.add;

public class MyStringReplace{
	
	String str;
	
	
	public MyStringReplace() {
	} // end constructor
	public MyStringReplace(String str) {
		this.str = str;
	} // end constructor		
		
	public String replace(String oldstr, String newstr, int pos) {

		
		
		
		
		
		return oldstr;
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		String str = "000111222333111222333";
		System.out.println(str);
		StringReplace sc = new StringReplace(str);
		System.out.println(sc.replace("111", "AAA", 0));
	}
}