package aug11;

public class WhileEx1 {
	public static void main(String[] args) {
		
		int arg = Integer.parseInt(args[0]);
		int sum = 0;
		int i = 0;
				
		while(i<=arg) {
			sum += i;
			i++;
		}
		System.out.println("1부터 "+"arg"+"의 합은 "+sum+" 입니다");
		
	}
}
