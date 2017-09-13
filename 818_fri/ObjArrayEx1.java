package jan25;

class ObjArrayEx1 {
	public static void main(String[] args){
		String[] arr; //객체형배열 선언
		arr = new String[3]; //객체형배열 생성

		arr[0] = "Java ";
		arr[1] = "Array ";
		arr[2] = "Test";
		//arr[3] = "SSOL";

		for(int i = 0 ; i < arr.length ; i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}
 }
