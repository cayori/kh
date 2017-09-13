package aug18.add;

// 100개의 숫자중에 들어있는 숫자종류 갯수세기

class ArrayEx6
{
	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		int[] count = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] = (int)(Math.random()*10));
		} // end for i
		System.out.println();
		System.out.println();
		
//		for(int i=0; i<count.length; i++) {
//			for(int j=0; j<numbers.length; j++) {
//				if(numbers[j]==i)	count[i]++;
//			} // end for j
//		} // end for i

		for(int i=0; i<numbers.length; i++) {
			count[numbers[i]]++;
		} // end for i
		
		for(int i=0; i<count.length; i++) {
			System.out.println(i+" 의 갯수 : "+count[i]);
		}
		
	}
}
