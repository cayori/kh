package aug17.add;

<<<<<<< HEAD
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
=======
public class MyStringReplace {
	  
	  // 오리지날 스트링을 받고
	  // 스트링 두개 old, nw 를 받아서
	  // 오리지날에서 old 의 위치를 디텍팅,
	  // new 로 바꿔준다. 
	  // 바뀐곳 잘라서 따로 보관
	  // 자른 나머지에서 다시 실행 (loop)
	  // 결과가 null 이 나오면 다시 다 합쳐서 리턴
	  
	  // 스트링을 StringBuffer 를 이용해서 찰칵찰칵 
	  // StringBuffer 의 replace 메소드
	  
	private String str;
	private int length;
	private StringBuffer buffer;
		
	public MyStringReplace() {this("");}
	public MyStringReplace(String str) {
			this.str = str;
			length = str.length();
			buffer = new StringBuffer(length + 100);
		}
	
	
	public String replace(String oldkey, String newkey) {
		return replace(oldkey, newkey, 0);
	}
	public String replace(String oldkey, String newkey, int pos) {
		
		
		// 아래부터 반복
		int index = 0;
		if(oldkey == null || newkey == null) return str;
		if( (index= str.indexOf(oldkey, pos)) != -1) {
			buffer.append(str.substring(pos, index));
			buffer.append(newkey);
			replace(oldkey, newkey, index+oldkey.length());
		}else {
			buffer.append(str.substring(pos));
		}		
		
		return buffer.toString();
	}
	  
	public static void main(String[] args) {
	    
	    String str = "000111222333111222333";
	    System.out.println(str);
	    MyStringReplace sc = new MyStringReplace(str);
	    System.out.println(sc.replace("111", "AAA"));
>>>>>>> first commit from KH
	}
}