package jan22;

class StaticTest2_1{

	String s1 = "static"; //instance
	static String s2 = "STATIC"; //static

	public static String getString(){ //static
		return s2; // 여기서 만약 s1을 return하면 오류!
	}
}
////////////////////////////////////////////////////////////
class StaticTest2 {

	public static void main(String[] args){
		System.out.println("s2 : "+StaticTest2_1.getString());
	}
}










