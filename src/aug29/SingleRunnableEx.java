package aug29;

public class SingleRunnableEx implements Runnable{
	private int temp[];
	
	public SingleRunnableEx() {
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for (int start : temp) {
			try{
				Thread.sleep(200);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s, ", Thread.currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}
	
	public static void main(String[] args) {
		SingleRunnableEx srt1 = new SingleRunnableEx();
		Thread t1 = new Thread(srt1, "첫번째");
		t1.start();
		SingleRunnableEx srt2 = new SingleRunnableEx();
		Thread t2 = new Thread(srt2, "첫번째");
		t2.start();
	}

}
