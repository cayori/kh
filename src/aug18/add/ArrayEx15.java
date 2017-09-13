package aug18.add;

public class ArrayEx15 {
	public static void main(String[] args) {
		if(args.length != 3 || args[1].length() != 1) {
			System.out.println("usage: java ArrayEx15 NUM1 OP NUM2");
			System.exit(0);
		} // end if
		
		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case 'x' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			default :
				System.out.println("지원되지 않는 연산입니다");
		} // end switch
		
		System.out.println("결과 : "+result);
	}
}
