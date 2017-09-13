package aug11;

public class Do_WhileEx1 {
	public static void main(String[] args) {
		
		int su = 5;
		String str = "Java DoublePlus";
		
		do {
			System.out.println("dowhile : "+str);
		}while(su-- >10);
		
		while(su-- > 10){
			System.out.println(str);
		}
	}
}
