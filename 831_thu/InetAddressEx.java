package last;

import java.net.*;
public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("ȣ��Ʈ �̸� : %s %n" , 
				iaddr.getHostName());
		System.out.printf("ȣ��Ʈ IP �ּ� : %s %n" , 
				iaddr.getHostAddress());
		
		iaddr = InetAddress.getByName("www.oracle.com");
		System.out.printf("ȣ��Ʈ �̸� : %s %n" ,  
				iaddr.getHostName());
		System.out.printf("ȣ��Ʈ IP �ּ� : %s %n" , 
				iaddr.getHostAddress());
		
		InetAddress sw[] = 
			InetAddress.getAllByName("www.naver.com");
		for (InetAddress temp_sw : sw) {
			System.out.printf("ȣ��Ʈ �̸� : %s , " ,  
					temp_sw.getHostName());
			System.out.printf("ȣ��Ʈ IP �ּ� : %s %n" , 
					temp_sw.getHostAddress());
		}
	}
}













