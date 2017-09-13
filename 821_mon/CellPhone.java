package jan26;

class CellPhone {

	String model; //멤버변수
	String number; //멤버변수
	int chord; //멤버변수

//setXXX() : 설정관련내용
//getXXX() : 설정내용을 리턴
//isXXX() : 리턴타입이 boolean형이다......

	protected void setNumber(String n){
		number = n;
	}
	public String getModel(){
 		return model;
	}
	public int getChord(){
		return chord;
	}
	public String getNumber(){
		return number;
	}
}
