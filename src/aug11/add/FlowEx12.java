package aug11.add;

public class FlowEx12 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=10000; i++) {
			sum += i;
		}
		
		System.out.println("1~"+(i-1)+" 까지의 합: "+sum);
	}
}
