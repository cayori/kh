package aug18.add;

//랜덤으로 뽑은 숫자들을 크기 순으로 정렬시키기

public class ArrayEx5 {
	public static void main(String[] args) {
//		int[] number = new int[10];
//		for(int i=0; i<number.length; i++) {
//			System.out.print(number[i] = (int)(Math.random()*10));
//		}

		int[] number = {4,4,7,5,6,9,8,8,6,9};
		for(int i=0; i<number.length; i++) {
		System.out.print(number[i]);
	}

		
		System.out.println();
		System.out.println();
		
		// 이제 정렬시킵시다
		
		int temp;
		
		for(int i=0; i<number.length-1; i++) {
			boolean changed = false;
			
			for(int j=i+1; j<number.length; j++) {
				if(number[i] > number[j]) {	// 뒷번호와 바꿔
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					changed = true;
				} // end if 
			} //end for j
			
			if(changed) {
				for(int k=0; k<number.length; k++) {
					System.out.print(number[k]);
				} // end for k
				System.out.println();;
			} // end if(changed)
		} //end for i
	}
}
