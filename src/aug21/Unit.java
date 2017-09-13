package aug21;

public abstract class Unit {
	protected String name;
	protected int energy;
	protected boolean fly;
	
	public abstract void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
}
