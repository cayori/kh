package javaFundamental;

import java.io.*;

public class SmartProgram {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output2.txt");
			String str1 = "내 귀는 소라껍질";
			String str2 = "바다 소리를 그리워한다.";
			
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
