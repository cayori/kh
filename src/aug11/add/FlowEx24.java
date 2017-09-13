package aug11.add;

import java.io.IOException;

public class FlowEx24 {
	public static void main(String[] args) throws IOException {
		int input=0;
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x 를 입력하세요");
		
		do {
			input = System.in.read();
			System.out.print((char)input);
		}while(input != -1 && input !='x');
		
		System.out.println("프로그램이 종료됩니다");
	}
}
