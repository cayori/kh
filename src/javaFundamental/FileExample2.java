package javaFundamental;

import java.io.*;

public class FileExample2 {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			File file = File.createTempFile("tmp", ".txt", new File("C:\\temp"));
			writer = new FileWriter(file);
			writer.write('ÀÚ');
			writer.write('¹Ù');
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
