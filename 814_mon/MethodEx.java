package jan21;

class MethodEx {
	int var1,var2; //멤버변수들(전역변수)
	
	//public MethodEx(){}
	
	public int sum(int a, int b){ //멤버메서드
	//접근제한자 리턴타입 메소드명(매개변수1,매개변수2)		
		return a+b;
	}static
	public  void main(String[] args){		
		MethodEx me = new MethodEx(); //객체를 생성
		int res = me.sum(1000, -10);//메서드 호출 ===>지역변수저장
		System.out.println("res="+res);
	}
}

//MethodEx
//...............
//int var1,var2
//...............
//sum()













