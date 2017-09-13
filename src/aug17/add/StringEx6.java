package aug17.add;

public class StringEx6 {
	public static void main(String[] args) {
		char[] cArr = new char[0];
		String s = new String(cArr);
		
		System.out.println("cArr.length : "+cArr.length);
		System.out.println("s.length() : "+s.length());
		System.out.println("@@@"+s+"@@@");
	}
}
