package aug21;

public class Terran extends Unit{
	public Terran(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	public void decEnergy() {
		energy -= 3;
	}
}
