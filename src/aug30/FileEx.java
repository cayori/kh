package aug30;

import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\Users\\user1\\Downloads";
		File f1 = new File(filePath);
		
		String list[] = f1.list();
		for(int i=0; i<list.length; i++) {
			File f2 = new File(filePath,list[i]);
			if(f2.isDirectory()) {
				System.out.printf("%s : 디렉토리 %n", f2.getName());    //f2.getName()
			}else {
				System.out.printf("%s : 파일(%,dbyte)%n", f2.getName(), f2.length());
			}
		}
		
		System.out.println();
		System.out.println();
		
		
		File f3 = new File("C:\\io\\test.txt");
		System.out.println(f3.createNewFile());
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.getCanonicalPath());
		System.out.println(f3.getPath());
		System.out.println(f3.getName());
		System.out.println(f3.getParentFile());
		File f4 = new File("C:\\io\\test.txt");
		File f5 = new File("C:\\io\\test1111.txt");
		//System.out.println(f4.renameTo(f5));
		
	}
}
