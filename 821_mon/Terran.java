package jan26;

class Terran extends Unit{
	boolean fly;
	public Terran(String n, boolean b){
		name = n;
		energe = 100;
		fly = b;
	}
	public void decEnerge(){
		energe -= 3;
	}
}
