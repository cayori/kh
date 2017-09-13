package aug29;

class ATM implements Runnable{
	private long depositMoney = 10000;
	public void run() {
		//synchronized (this) {
			for (int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				if(getDepositMoney() <=0)
					break;
				withDraw(500);
			}
		//}
	}
	private void withDraw(long howMuch) {
		if(getDepositMoney() > 0) {
			depositMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %d 원 %n", getDepositMoney());
		}else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다");
		}
	}
	private long getDepositMoney() {
		return depositMoney;
	}
	
}

public class SynchronizedEx {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother1 = new Thread(atm, "mother1");
		Thread son1 = new Thread(atm, "son1");
		Thread mother2 = new Thread(atm, "mother2");
		Thread son2 = new Thread(atm, "son2");
		Thread mother3 = new Thread(atm, "mother3");
		Thread son3 = new Thread(atm, "son3");
		mother1.start();
		son1.start();
		mother2.start();
		son2.start();
		mother3.start();
		son3.start();
	}
}
