package aug18;

public class ObjArrayEx5 {
	public static void main(String[] args) {
		
		int[][] test = new int[2][3];
		
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		
		for(int i[] : test)	{
			for(int j : i)
				System.out.println(j);
		}
	}
}
