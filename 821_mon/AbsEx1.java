package jan26;

//추상 클래스는 일반 변수, 메서드, 상수 모두 가질 수 있다.
//하지만 추상메서드를 하나라도 가진 경우를 말한다.
abstract class AbsEx1{
	int a = 100; //변수
	final String str = "abstract test"; //상수
	public String getStr(){ //일반 메서드
		return str;
	}

	// 추상 메서드 : 몸체가 없다.{}블럭이 없다....
	abstract public int getA();
}
