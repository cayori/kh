package aug11;

public class IfEx2 {
	public static void main(String[] args) {
		int su1 = Integer.parseInt(args[0]);
		String str;
		
		if(su1>=50)	str="50 이상";
		else		str="50 미만";
		
		System.out.println(str+" 입니다");
	}
}
