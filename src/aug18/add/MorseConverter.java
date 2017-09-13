package aug18.add;

public class MorseConverter {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("usage: java MorseConverter WORD");
			System.exit(0);
		} // end if
		
		String src = args[0];
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
