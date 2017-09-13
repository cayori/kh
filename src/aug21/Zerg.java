package aug21;

public class Zerg extends Unit{
	public Zerg(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	
	public void decEnergy() {
		energy -= 6;
	}
}
