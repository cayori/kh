package jan25;

//System.arraycopy()
class  ArrayCopyEx { 
	public  static void main( String args[] ) { 
		
		byte ar1[] = {11,22,33,44,55}; //배열선언,생성 ar1.length=5
        byte ar2[] = new byte[10];  //배열선언,생성
        System.arraycopy(ar1, 0, ar2, 3, 5);
		//ar1이라는배열의 0번째인덱스부터 5개의 값을 ar2라는 배열의 3번째 인덱스의 위치로 복사해라.

		System.out.println("::::::: 원본 배열 :::::::");
        for(byte n : ar1) // for(byte n;n < ar1.length; n++)
			System.out.println( n ); 
		System.out.println("::::: 복사본 배열 :::::");
        for(byte n : ar2) 
			System.out.println( n ); 
        
	} 
} 





