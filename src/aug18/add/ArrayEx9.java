package aug18.add;

public class ArrayEx9 {
	public static void main(String[] args) {
		String src = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
				,"..-.", "--.", "....","..",".---"
				, "-.-", ".-..", "--", "-.", "---"
				, ".--.", "--.-",".-.","...","-"
				, "..-", "...-", ".--", "-..-","-.--"
				, "--.." };
		String result="";
		
		for(int i=0; i<src.length(); i++) {
			result += morse[src.charAt(i)-'A'];
		} // end for i
		
		System.out.println("source : "+src);
		System.out.println("morse : "+result);
	}
}
