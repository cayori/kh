package aug30.scan;

import java.util.*;

public class ScannerConsoleEx {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		
		Scanner scan = new Scanner(System.in);
		
		String number = scan.next();
		System.out.printf("스캔 : %s", number);
		scan.close();
	}
}
