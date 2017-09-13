package aug18;

public class ObjArrayEx3 {
	public static void main(String[] args) {
		String[] arr = {"윤아", "♥", "윤서"};
		
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		System.out.println();
		
		for(String s : arr) System.out.println(s);
	}
}
