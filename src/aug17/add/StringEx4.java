package aug17.add;

public class StringEx4 {
	public static void main(String[] args) {
		
		String[] words = {new String("aaa"), new String("bbb"), new String("ccc")};
		
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("ccc"))	System.out.println("words 에서 equals 메서드로 찾았습니다");
			if(words[i] == "ccc")		System.out.println("words 에서 == 연산자로 찾았습니다");
		}
		for(int i=0; i<words.length; i++) {
			words[i] = words[i].intern();
		}
		
		System.out.println("<< String 배열 words의 문자열에 intern 메서드를 수행한 후 >>");
		
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("ccc"))	System.out.println("words 에서 equals 메서드로 찾았습니다");
			if(words[i] == "ccc")		System.out.println("words 에서 == 연산자로 찾았습니다");
		}
		for(int i=0; i<words.length; i++) {
			words[i] = words[i].intern();
		}
		
	}
}
