package jan21;

//call by value : var1이라는 원래변수 값에는 변동이 없다.
class ValueParameter{
	
	public int increase(int n){ //n=var1
		++n;
		return n;
	}
	public static void main(String[] args){
		int var1 = 100; //지역변수
		ValueParameter vp = new ValueParameter(); //객체
		int var2 = vp.increase(var1); //101
		System.out.println("var1 : "+ var1 + ", var2 : " + var2);
	}
}

//ValueParameter
//===========
//increase()