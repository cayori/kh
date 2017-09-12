package javaFundamental;

import java.io.*;

public class DullProgram {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			String str1 = "�� �ʹ� �Ҷ���";
			String str2 = "�ٴ� �Ҹ��� �׸����Ѵ�.";
			for(int i=0; i<str1.length(); i++) {
				writer.write(str1.charAt(i));
			}
			
			writer.write('\n');
			for(int i=0; i<str2.length(); i++) {
				writer.write(str2.charAt(i));
			}
			writer.write('\n');
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�");
			ioe.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
