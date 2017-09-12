package aug18.add;

public class Lotto {
	public static void main(String[] args) {
		
		SingleLotto[] lottoArray = new SingleLotto[30000];									//객체배열
		for(int i=0; i<lottoArray.length; i++) {											//각 객체 생성
			lottoArray[i] = new SingleLotto();
			}
		
		int[][] results = new int[lottoArray.length][lottoArray[0].getResult().length];		//2차원배열
		
		for(int i=0; i<results.length; i++) {												//각 객체의 result 배열을 2차원 배열로 복사
			System.arraycopy(lottoArray[i].getResult(), 0, results[i], 0, lottoArray[i].getResult().length);
		}
		
//		for(int i=0; i<results.length; i++) {
//			for(int j=0; j<lottoArray[i].getResult().length; j++) {
//				System.out.println(i+" "+j+" "+results[i][j]);
//			} // end for j
//		} // end for i 
		
		// result 에 있는거 한글자씩 나오면 int[][]counter 해당하는 배열을 올려
		int[][] counter = new int[45][2];
		for(int i=0; i<results.length; i++) {
			if(i<45)	counter[i][0] = i+1; // 공 번호들을 2차원 0 인자에 넣음
			for(int j=0; j<lottoArray[i].getResult().length; j++) {
				counter[results[i][j]-1][1]++;
			} // end for j
		} // end for i 
		
		
//		//잘 드갔나 확인용 코드
//		int sum = 0;
//		for(int i=0; i<counter.length; i++) {
//			System.out.println((i+1)+" 번이 나온 횟수 : "+counter[i]);
//			sum += counter[i];
//		}
//		System.out.println(sum);
		
		
//		// 번호+횟수 배열에 넣기   ===>>> 2차원 배열 order를 선언하지 않고 counter를 2차원으로 만들어서 이용합니다 
//		int[][] order = new int[45][2];	// counter[]
//		for(int i=0; i<order.length; i++) {
//			order[i][0] = i;
//			order[i][1] = counter[i];
//		}
		
		// 이제 줄을 세워야죠.
		int[] temp = new int[counter.length];
		for(int i=0; i<counter.length-1; i++) {
			for(int j=i+1; j<counter.length; j++) {
				if(counter[i][1] < counter[j][1]) {
					temp = counter[j];
					counter[j] = counter[i];
					counter[i] = temp;
				} //end if
			} // end for j
		} // end for i
		
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+" 위 번호 "+counter[i][0]+" 번의 출력횟수 : "+counter[i][1]+" 회");
		}


	}
}


class SingleLotto{

	private int[] numbers = new int[45];
	private int[] result = new int[6];
	
	public int[] getNumbers() {return numbers;}
	public int[] getResult() {return result;}

	//생성자... 45개 공을 막 섞어줘서 6개 뽑고 각각 numbers 랑 result 에 넣어둠
	public SingleLotto() {
		
		for(int i=0; i<numbers.length; i++) {numbers[i]=i+1;}		// 공은 0~45 아니라 1~46
		
		int temp, n1, n2;
		
		for(int i=0; i<300; i++) {
			n1 = (int)(Math.random()*45);
			n2 = (int)(Math.random()*45);
			
			temp = numbers[n1];
			numbers[n1] = numbers[n2];
			numbers[n2] = temp;
		} // end for i
		
		System.arraycopy(numbers, 0, result, 0, 6);
	}
}