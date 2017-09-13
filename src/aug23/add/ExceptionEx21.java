package aug23.add;

import java.io.*;

public class ExceptionEx21 {
	public static void main(String[] args) {
		// command line 에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다");
	}
	
	static File createFile(String fileName) {
		
		try{
			if(fileName == null || fileName.equals(""))	throw new Exception();
		}catch(Exception e) {
			fileName = "제목없음.txt";
		}finally {		
			File f = new File(fileName);		// File 클래스의 객체를 만든다
			createNewFile(f);					// 생성된 객체를 이용해서 파일을 생성한다
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();				// 파일을 생성한다
		} catch (IOException ioe) {}
	}
}
