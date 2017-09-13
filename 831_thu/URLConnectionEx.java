package last;

import java.net.*;
import java.io.*;
import java.util.*;
class URLConnectionEx{
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://docs.oracle.com/javase/7/docs/api/overview-summary.html");
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		
        Map<String , List<String>> map = urlCon.getHeaderFields();
        Set<String> s = map.keySet();
        Iterator<String> iterator = s.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.print(name + " : ");
            List<String> value = map.get(name);
            for(String _temp : value)
                System.out.println(_temp);
        }
		int len = urlCon.getContentLength();
		System.out.println("������ ����  : "+len+" ����Ʈ");
		if(len>0){
			InputStream input = urlCon.getInputStream();
            System.out.println("=== ������ ���� ===");
            int readByte;
            while(((readByte = input.read()) != -1) && (--len>0)){
				System.out.print((char)readByte);
			}
			input.close();
		}else{
			System.out.println("������ ����");
		}		
	}
}









