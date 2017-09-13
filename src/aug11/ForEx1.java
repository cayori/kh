package aug11;

public class ForEx1 {
	public static void main(String[] args) {
		int j = Integer.parseInt(args[0]);
		
		for(int i=0; i<j; i++) {
			System.out.println((i+1)+" 번째 수행");
		}
	}
}
