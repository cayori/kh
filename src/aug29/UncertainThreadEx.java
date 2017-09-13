package aug29;

class MyRunnableOne implements Runnable{
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

public class UncertainThreadEx {
	public static void main(String[] args) {
		System.out.println("main start");
		Runnable r = new MyRunnableOne();
		Thread myThread = new Thread(r, "러너블");
		myThread.start();

		try {
			myThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("main end");
	}

}
