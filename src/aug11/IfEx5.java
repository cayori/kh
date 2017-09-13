package aug11;

public class IfEx5 {
	public static void main(String[] args) {
		int jumsu = Integer.parseInt(args[0]);
		String res;
		
//		if		(jumsu>=90 && jumsu<=100)	res = "A 학점";
//		else if	(jumsu>=80 && jumsu<90)		res = "B 학점";
//		else if	(jumsu>=70 && jumsu<80)		res = "C 학점";
//		else if	(jumsu>=60 && jumsu<70)		res = "D 학점";
//		else if	(jumsu>=50 && jumsu<60)		res = "E 학점";
//		else								res = "FFFFF";
//		
//		System.out.println(res+" 입니다");
		
		
		res =	(jumsu>=90 && jumsu<=100)	? "A 학점":(
				(jumsu>=80 && jumsu<90)		? "B 학점":(
				(jumsu>=70 && jumsu<80)		? "C 학점":(
				(jumsu>=60 && jumsu<70)		? "D 학점":(
				(jumsu>=50 && jumsu<60)		? "E 학점":(
											  "FFFFF"
				)))));
		
		System.out.println(res+" 입니다");
	}
}
