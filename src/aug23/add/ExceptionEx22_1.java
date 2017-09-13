package aug23.add;

import java.io.*;

public class ExceptionEx22_1 {
	public static void main(String[] args) {
		
		if(args.length < 1)	{
			System.out.println("다시 입력해 주시기 바랍니다");
			System.exit(0);
		}
	
		File f = createFile(args[0]);
		System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다");
	}
	
	static File createFile(String fileName) {

		File f = new File(fileName);
		try						{f.createNewFile();}
		catch(IOException e)	{}
		return f;
	}
}
