package jan21;

class MethodEx2 {
	
	private int var;//멤버변수(전역변수) : 기본값0
	
	public void setInt(int var){
		this.var = var; //메소드의 전달되는 매개변수로 클래스의 전역변수를 초기화한다....
	}
	
	public int getInt(){
		return var;
	}
	
	public static void main(String[] args){
		MethodEx2 me2 = new MethodEx2(); //객체생성
		me2.setInt(1000); //전역변수를 초기화한다.
		System.out.println("var : "+ me2.getInt());
	}
	
}

//MethodEx2
//=======
//var
//=======
//setInt()
//getInt()


















