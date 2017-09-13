package aug18.add;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			number[i] = i;
			System.out.print(number[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int temp;
			int n1 = (int)(Math.random()*10);
			int n2 = (int)(Math.random()*10);
			
			temp = number[n1];
			number[n1] = number[n2];
			number[n2] = temp;
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]);
		}
	}
}
