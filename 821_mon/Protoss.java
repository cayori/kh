package jan26;

class Protoss extends Unit{
	boolean fly;
	public Protoss(String n, boolean b){
		name = n;
		energe = 100;
		fly = b;
	}
	public void decEnerge(){
		energe--;
	}
}
