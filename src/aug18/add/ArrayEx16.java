package aug18.add;

import javax.swing.*;

public class ArrayEx16 {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		String temp = "";
		int count = 0;
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100 ������ ���ڸ� �Է��ϼ���."
											+"�������� -1�� �Է��ϼ���.");
			if(temp == null || temp.equals("-1")) break;
			
			System.out.println("�Է°� : "+temp);
			
			input = Integer.parseInt(temp);
			
			if(input > 100 || input < 1) System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			else {
				if(answer > input) {System.out.println("�� ū ���� �Է��ϼ���");}
				else if(answer < input) {System.out.println("�� ���� ���� �Է��ϼ���");}
				else if(answer == input) {
					System.out.println("�����Դϴ�");
					break;
				}
			}
			
		}while(true);
		
		System.out.println("================");
		if(count>1) System.out.println("�õ� Ƚ���� "+count+" ȸ �Դϴ�.");
		System.out.println("���α׷��� ����˴ϴ�.");
	}
}
