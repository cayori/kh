package aug18.add;

public class StringCount {

	String src;
	int count = 0;
	int index = 0;
			
	// 생성자 두개 override
	public StringCount() {
		this.src = "";
	}
	public StringCount(String src) {
		this.src = src;
	}
	
	// 카운트 함수 override
	public int stringCount(String key) {
		return stringCount(key, 0);
	}
	public int stringCount(String key, int pos) {
		// 소스가 있고, 검색키가 있고, 검색시작 요청위치가 있어.
		// 소스에서 검색시작 요청위치부터 검색키에 해당하는게 있는지를 검사해야겠지
	
		//index = src.indexOf(key);
		
		
		if(key == null || key.length() == 0) return 0;
		if((index = src.indexOf(key, pos)) != -1) {
			count++;
			stringCount(key, index+key.length());
		}
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		StringCount sc = new StringCount(str);
		System.out.println("aa를 "+sc.stringCount("aa",0)+"개 찾았습니다");
	}
}
