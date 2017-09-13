package jan25;

class ObjArrayEx2 {
	public static void main(String[] args){
		
		String[] arr; //객체형배열 선언
		
		if(args.length > 0) {//실행할때 명령줄인수를 넣어줬다면....
			arr = args; //args가 가리키고 있는 Heap영역메모리의 주소를 arr도 가리키도록 설정한다.
			                //메모리주소가 복사
			for(int i = 0 ; i < arr.length ; i++)
				System.out.println("arr["+i+"]:"+arr[i]);
		}else
			System.out.println("args의 내용이 없습니다.");
	}
}
