package aug11;

public class GuguDanEx1 {
	public static void main(String[] args) {
		
//		int dan = Integer.parseInt(args[0]);
//		
//		System.out.println(dan+" 단 :");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+" * "+i+" : "+(i*dan));
//		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(i+" 단 :");
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		char ch = 'A';
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				System.out.print((ch++)+"\t");
			}
			System.out.println();;
		}
		
		
	}
}
