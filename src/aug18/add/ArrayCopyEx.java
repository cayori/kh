package aug18.add;

public class ArrayCopyEx {
	public static void main(String[] args) {
		
		byte[] ar1 = {11,22,33,44,55};
		byte[] ar2 = new byte[10];
		System.arraycopy(ar1, 0, ar2, 3, 5);
		
		System.out.println("===== 원본배열 =====");
		for(byte a : ar1) System.out.println(a+" ");
		System.out.println("===== 복사배열 =====");
		for(byte a : ar2) System.out.println(a+" ");
	} // end main
}
