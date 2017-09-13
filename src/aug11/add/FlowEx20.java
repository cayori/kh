package aug11.add;

public class FlowEx20 {
	public static void main(String[] args) {
		System.out.println("카운트다운 시작");
		
		for(int i=10; i>=0; i--) {
			for(long j=0; j<2592000000L; j++) {
				;
			}
			System.out.println(i);
		}
		System.out.println("게임종료");
	}
}
