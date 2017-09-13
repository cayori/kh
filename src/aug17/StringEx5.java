package aug17;

public class StringEx5 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
		//           01234567890
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n 의 위치 : "+index);
		
		index = s1.indexOf("Sun");
		System.out.println("맨 처음 Sun 의 위치 : "+index);
		
		index = s1.lastIndexOf('n');
		System.out.println("맨 마지막 n 의 위치 : "+index);
		
		char c = s1.charAt(index);
		System.out.println("index 위치에서 추출한 문자 : "+c);
		
		
		
		index = s1.indexOf('S');
		String str = s1.substring(index);
		System.out.println("대문자 S로부터 끝까지 잘라내기 : "+str);
		
		str = s1.substring(index,  index+3); // 게시판 제목 같은데서 이용할 수 있다.
		System.out.println("대문자 S로부터 3글자 잘라내기 : "+str);
		
		int length = s1.length();
		System.out.println("s1 의 길이 : "+length);
		
		String[] arr = s1.split(" ");
		for(int i = 0; i<arr.length; i++)
			System.out.println("arr["+i+"] : "+arr[i]);
	}
}
