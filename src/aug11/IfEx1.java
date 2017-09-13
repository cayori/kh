package aug11;

public class IfEx1 {
	public static void main(String[] args) {
		
		// console 에서 실행할 때는 bin 폴더에서 "패키지.클래스" 형태로 실행 
		int su1 = Integer.parseInt(args[0]);
		String str = "50 미만";
		
		if(su1 >= 50)	str = "50 이상";
		
		System.out.println(str+" 입니다");
	}
}
