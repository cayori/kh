package javaFundamental;

import java.io.*;

public class SmartProgram {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output2.txt");
			String str1 = "�� �ʹ� �Ҷ���";
			String str2 = "�ٴ� �Ҹ��� �׸����Ѵ�.";
			
			writer.write(str1+"\n"+str2);
		}catch(IOException ioe) {
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
