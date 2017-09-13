package aug29;

class MyRunnableTwo implements Runnable{
	public void run() {
		System.out.println("run");
		System.out.println(Thread.currentThread().getName());
		first();
	}
	public void first() {
		System.out.println("first");
		System.out.println(Thread.currentThread().getName());
		second();
	}
	public void second() {
		System.out.println("second");
		System.out.println(Thread.currentThread().getName());
	}
}

public class JoinEx {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r, "마이쓰레드");
		myThread.start();
		
		try {
			myThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");
	}
}
