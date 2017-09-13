package aug11.add;

public class FlowEx22 {
	public static void main(String[] args) {
		int i,j;
		
		i=2;
		while(i<=9) {
			j = 1;
			while(j<=9) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++;
		}
	}
}
