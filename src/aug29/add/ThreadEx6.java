package aug29.add;

import javax.swing.JOptionPane;

public class ThreadEx6 {
	
	static boolean isInput = false; 
	
	public static void main(String[] args) {

		Thread timer = new Thread(new Timer());
		Thread input = new Input();
		timer.start();
		input.start();
		
	}
}

class Timer implements Runnable{
	public void run() {
		for(int i=10; i>0; i--) {
			if(ThreadEx6.isInput == true) return;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		System.out.println("프로그램이 종료되었습니다");
		System.exit(0);
	}
}

class Input extends Thread{
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+" 입니다");
		ThreadEx6.isInput = true;
	}
}