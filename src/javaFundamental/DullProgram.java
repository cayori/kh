package javaFundamental;

import java.io.*;

public class DullProgram {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			String str1 = "내 귀는 소라껍질";
			String str2 = "바다 소리를 그리워한다.";
			for(int i=0; i<str1.length(); i++) {
				writer.write(str1.charAt(i));
			}
			
			writer.write('\n');
			for(int i=0; i<str2.length(); i++) {
				writer.write(str2.charAt(i));
			}
			writer.write('\n');
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다");
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
