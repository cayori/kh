package javaFundamental;

import java.io.*;

public class DataReaderProgram {
	public static void main(String[] args) {
		DataInputStream in = null;
		try {
			in = new DataInputStream( new FileInputStream("output.dat") );
			
			int idata;
			double ddata;
			
			idata = in.readInt();
			System.out.println(idata);
			idata = in.readInt();
			System.out.println(idata);
			ddata = in.readDouble();
			System.out.println(ddata);
			
/*			while(true) {
				int data = in.readInt();
				if(data<0)	{
					System.out.println("data<0");
					System.exit(0);
				}
				System.out.println(data); */
			
		} catch (FileNotFoundException e) {
			System.out.println("cannot find the specified file");
		} catch (EOFException eofe) {
			System.out.println("end of file");
		} catch (Exception e) {
			System.out.println("cannot read file");
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
