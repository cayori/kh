package aug29.add;

public class ThreadEx9 {
	
	public static int counter = 0;
	
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();
		ThreadEx9_3 th3 = new ThreadEx9_3();
		
		th3.setPriority(10);
		
		System.out.println("Priority of th1(-) : "+th1.getPriority());
		System.out.println("Priority of th2(|) : "+th2.getPriority());
		System.out.println("Priority of th3  : "+th3.getPriority());
		th3.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
	}
}

class ThreadEx9_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			ThreadEx9.counter++;
			try{sleep(100);} catch(Exception e) {}			
		}
	}
}
class ThreadEx9_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			ThreadEx9.counter++;
			try{sleep(100);} catch(Exception e) {}			
		}
	}
}
class ThreadEx9_3 extends Thread{
	public void run() {
		while(true) {
			if(ThreadEx9.counter > 60) {
				System.out.println();
				ThreadEx9.counter = 0;
			}
			try{sleep(1);} catch(Exception e) {}
		}
	}
}