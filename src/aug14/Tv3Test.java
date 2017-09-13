package aug14;

class Tv3{
	int channel;
	String color;
	boolean power;
	
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	void power() {power = !power;}
	
}

public class Tv3Test {
	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		System.out.println("t1 의 채널은 "+t1.channel+" 입니다.");
		System.out.println("t2 의 채널은 "+t2.channel+" 입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1 의 채널은 "+t1.channel+" 입니다.");
		System.out.println("t2 의 채널은 "+t2.channel+" 입니다.");
	}
}
