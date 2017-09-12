package javaFundamental;

import java.io.*;

public class DataSaverProgram {
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream( new FileOutputStream("output.dat") );
			out.writeInt(7);
			out.writeInt(5);
			out.writeDouble(17.5);
		}catch(IOException ioe) {
			System.out.println("cannot export to file");
		}finally {
			try {
				out.close();
			}catch (Exception e) {
				
			}
		}
	}
}
