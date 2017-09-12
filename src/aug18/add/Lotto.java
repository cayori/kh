package aug18.add;

public class Lotto {
	public static void main(String[] args) {
		
		SingleLotto[] lottoArray = new SingleLotto[30000];									//��ü�迭
		for(int i=0; i<lottoArray.length; i++) {											//�� ��ü ����
			lottoArray[i] = new SingleLotto();
			}
		
		int[][] results = new int[lottoArray.length][lottoArray[0].getResult().length];		//2�����迭
		
		for(int i=0; i<results.length; i++) {												//�� ��ü�� result �迭�� 2���� �迭�� ����
			System.arraycopy(lottoArray[i].getResult(), 0, results[i], 0, lottoArray[i].getResult().length);
		}
		
//		for(int i=0; i<results.length; i++) {
//			for(int j=0; j<lottoArray[i].getResult().length; j++) {
//				System.out.println(i+" "+j+" "+results[i][j]);
//			} // end for j
//		} // end for i 
		
		// result �� �ִ°� �ѱ��ھ� ������ int[][]counter �ش��ϴ� �迭�� �÷�
		int[][] counter = new int[45][2];
		for(int i=0; i<results.length; i++) {
			if(i<45)	counter[i][0] = i+1; // �� ��ȣ���� 2���� 0 ���ڿ� ����
			for(int j=0; j<lottoArray[i].getResult().length; j++) {
				counter[results[i][j]-1][1]++;
			} // end for j
		} // end for i 
		
		
//		//�� �尬�� Ȯ�ο� �ڵ�
//		int sum = 0;
//		for(int i=0; i<counter.length; i++) {
//			System.out.println((i+1)+" ���� ���� Ƚ�� : "+counter[i]);
//			sum += counter[i];
//		}
//		System.out.println(sum);
		
		
//		// ��ȣ+Ƚ�� �迭�� �ֱ�   ===>>> 2���� �迭 order�� �������� �ʰ� counter�� 2�������� ���� �̿��մϴ� 
//		int[][] order = new int[45][2];	// counter[]
//		for(int i=0; i<order.length; i++) {
//			order[i][0] = i;
//			order[i][1] = counter[i];
//		}
		
		// ���� ���� ��������.
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
			System.out.println((i+1)+" �� ��ȣ "+counter[i][0]+" ���� ���Ƚ�� : "+counter[i][1]+" ȸ");
		}


	}
}


class SingleLotto{

	private int[] numbers = new int[45];
	private int[] result = new int[6];
	
	public int[] getNumbers() {return numbers;}
	public int[] getResult() {return result;}

	//������... 45�� ���� �� �����༭ 6�� �̰� ���� numbers �� result �� �־��
	public SingleLotto() {
		
		for(int i=0; i<numbers.length; i++) {numbers[i]=i+1;}		// ���� 0~45 �ƴ϶� 1~46
		
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