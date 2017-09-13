package aug30.scan;

import java.util.*;
import java.io.*;

public class ScannerFileEx {
	public static void main(String[] args) {
		Scanner scan = null;
		File file = new File("C:\\io\\scan.txt");
		try {
			scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.printf("스캔 : %s %n", scan.next());
			
//			scan = new Scanner(new File("C:\\io\\scan.txt"));
//			while(scan.hasNext()) {
//				System.out.printf("스캔 : %s %n", scan.next());
				
			}
			scan.close();
			
		}catch(IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}finally {
			if(scan != null) scan.close();
		}
	}
}
