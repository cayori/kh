package aug29.add;

public class ThreadEx2 {
	public static void main(String[] args) throws Exception{
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.run();
	}
}

class ThreadEx2_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}