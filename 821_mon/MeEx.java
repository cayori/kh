package jan26;

class Me{
	final int var = 100;
	public void setVar(int var){ //상속받는 클래스에서 오버라이딩 할 수 없다.....
		this.var = var;
	}
}
class MeEx extends Me{

	public void setVar(int var){
		this.var = var;
	}
	public static void main(String[] args) {
		MeEx me = new MeEx();
		me.setVar(1000);
	}
}