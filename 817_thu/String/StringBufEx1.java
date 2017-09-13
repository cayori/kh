package jan22;

//import java.lang.*;

class StringBufEx1{

	public static void main(String[] args){

		int var = 0;
		StringBuffer sb = new StringBuffer("Sun-Ae"); //6+16
		var = sb.capacity();
		System.out.println("capacity : "+var);//22
		
		var = sb.length();//6
		System.out.println("length : "+var);
	}
}









