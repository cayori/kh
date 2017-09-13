package aug29;

public class SingleThreadEx extends Thread{
	private int[] temp;
	
	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for(int start : temp) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("스레드이름 : %s", currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}
	public static void main(String[] args) {
		SingleThreadEx st1 = new SingleThreadEx("첫번째");
		st1.start();
		
		SingleThreadEx st2 = new SingleThreadEx("두번째");
		
		st2.start();
	}
}
