package aug11;

public class My {
	public static void main(String[] args) {
		
		loop:
			for (int i=0; i<10; i++) {
				if(i==3)	continue;
				if(i==6)	break loop;
				System.out.println(i);
			}
	}
}
