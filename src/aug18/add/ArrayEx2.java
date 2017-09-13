package aug18.add;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];

		for(int i=0; i<score.length; i++) {
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}
		
//		for(int i : score) {
//			if(max < i) max = i;
//			if(min > i) min = i;
//		}
		System.out.println("최대값 :" + max);       
		System.out.println("최소값 :" + min); 
	}
}
