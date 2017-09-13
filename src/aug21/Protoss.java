package aug21;

public class Protoss extends Unit {
	public Protoss(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	public void decEnergy() {
		energy--;
	}
}
