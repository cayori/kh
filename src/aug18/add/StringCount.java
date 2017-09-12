package aug18.add;

public class StringCount {

	String src;
	int count = 0;
	int index = 0;
			
	// ������ �ΰ� override
	public StringCount() {
		this.src = "";
	}
	public StringCount(String src) {
		this.src = src;
	}
	
	// ī��Ʈ �Լ� override
	public int stringCount(String key) {
		return stringCount(key, 0);
	}
	public int stringCount(String key, int pos) {
		// �ҽ��� �ְ�, �˻�Ű�� �ְ�, �˻����� ��û��ġ�� �־�.
		// �ҽ����� �˻����� ��û��ġ���� �˻�Ű�� �ش��ϴ°� �ִ����� �˻��ؾ߰���
	
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
		System.out.println("aa�� "+sc.stringCount("aa",0)+"�� ã�ҽ��ϴ�");
	}
}
