package aug23.add;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		}catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		System.out.println("startInstall 입니다");
	}
	
	static void copyFiles() {
		System.out.println("copyFiles 입니다");
	}
	
	static void deleteTempFiles() {
		System.out.println("deleteTempFiles 입니다");
	}
}
