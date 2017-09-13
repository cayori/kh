package aug18.add;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[][] score = {	{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40},
							{50,50,50}};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(i+"\t");
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			} // end for j
			System.out.println(sum+"\t"+(sum/(float)score[i].length));
		} // end for i
		
		System.out.println("==============================================");
		System.out.println("총점\t"+koreanTotal+"\t"+englishTotal+"\t"+mathTotal);
	}
}
