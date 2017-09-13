package jan25;

class ArrayTest3{

	String imsi;
	
	public String[] swap(String[] arr){
		if(arr.length == 0)
			return null;

		imsi = arr[0]; //선애
		for(int i = 0 ; i < (arr.length-1) ; i++) //0 1
		{
			arr[i] = arr[i+1];
		//  arr[0] = i♡u;
		//  arr[1] = 사랑해;
		}
		arr[arr.length-1] = imsi;
		//arr[2] = 선애;
		return arr;
	}
	public static void main(String[] args) {
		ArrayTest3  mt3 = new ArrayTest3 ();
		String[] arr = {"선애","i♡u","사랑해"};
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
		
		arr = mt3.swap(arr);

		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i]+" ");
	}
}













