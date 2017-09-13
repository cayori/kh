package jan21;

//call by reference : 메서드에 전달된 매개변수의 원본은 매개변수 같이 변경된다.....
class ReferenceParameter{	
	public void increase(int[] n){ //n = ref1 : ref1이라는 배열이 가리키는 객체를 n이라는 배열도 
	                                       //              가리킨다.....
		for(int i = 0 ; i < n.length ; i++){ //배열의 처음n[0]부터 배열의 크기n[n.length-1]만큼 반복
			n[i]++; //i번째 배열의값을 1만큼증가
			System.out.println("n["+i+"] : "+ n[i]);
		}
	}
	public static void main(String[] args){
		int[] ref1 = {100,800,1000}; //ref1.length = 3
		ReferenceParameter rp = new ReferenceParameter(); //객체생성
		rp.increase(ref1);
		for(int i = 0 ; i < ref1.length ; i++)
			System.out.println("ref1["+i+"] : "+ ref1[i]);
	}
}

//ReferenceParameter
//=============
//increase(int[] n)
//배열
//int[] a = new int[5];
//int[] a = {1,2,3,4,5};
//a[0]=1 a[1]=2














