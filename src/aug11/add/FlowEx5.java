package aug11.add;

public class FlowEx5 {
	public static char grade(int score) {
		if		(score>=90 && score<=100)	return 'A';
		else if	(score>=80 && score<90)		return 'B';
		else if	(score>=70 && score<80)		return 'C';
		else if	(score>=60 && score<70)		return 'D';
		else if	(score>=50 && score<60)		return 'E';
		else								return 'F';
	}
	
	public static char detail(int single) {
		if 		(single>=8) return '+';
		else if	(single>=4) return '0';
		else				return '-';
	}
	
	public static void main(String[] args) {
		
		
		
		
		int score = (int)(Math.random()*50) + 50;
		int single = score-(score/10)*10;
		
		System.out.println("당신의 점수는 "+score+" 입니다");
		System.out.println("당신의 학점은 "+grade(score)+detail(single)+" 입니다");
				
	}
}
