package aug23.add;

public class NewExceptionTest {
	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			System.out.println("에러 메세지: "+se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 시도해 주세요");
		} catch (MemoryException me) {
			System.out.println("에러 메세지: "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 시도해 주세요");
		} finally {		
			deleteTempFiles();
		}		
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치공간이 부족합니다");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다");
	}
	
	static void copyFiles() {
		System.out.println("copyFiles 실행합니다");
	}
	
	static void deleteTempFiles() {
		System.out.println("deleteTempFiles 실행합니다");
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
}

class SpaceException extends Exception{
	SpaceException()			{super();}
	SpaceException(String msg)	{super(msg);}
}

class MemoryException extends Exception{
	MemoryException()			{super();}
	MemoryException(String msg)	{super(msg);}
}
