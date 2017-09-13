package aug14;
import javax.swing.*;

public class NumberGame {
	public static void main(String[] args) {
		// 랜덤값 저장
		// 사용자입력값 저장
		// 사용자 입력값 조건에 따라 프로그램 종료
		// 입력값과 랜덤값을 비교
		// 회차가 한번씩 지나갈 때마다 카운트 증가
		
		int answer;
		String temp;
		int input;
		int count = 0;
		
		answer = (int)(Math.random()*100);
		
		do {
			temp = JOptionPane.showInputDialog("1~100 사이의 숫자를 입력하세요."+" 끝내려면 -1 을 입력하세요.");
			if("-1".equals(temp) || temp == null) {    // 순서가 상관이 있나!!! ==> 순서는 상관없지만 equals 검사할때 좌변이 null 이면 nullPointException 에러가 발생!
				System.out.println("프로그램이 종료됩니다. 시도횟수는 "+count+" 번 입니다.");
				break;
			}
			
			count++;
			input = Integer.parseInt(temp);
			if(input>100 || input<1) {
				System.out.println("1~100 사이의 수를 입력하세요");
			}else if(input == answer) {
				System.out.println("정답입니다. 시도횟수는 "+count+" 번 입니다.");
				break;
			}else if (input>answer){
				System.out.println("더 작은 수를 입력하세요");
			}else{
				System.out.println("더 큰 수를 입력하세요");
			}
		}while(true);

	}
}
