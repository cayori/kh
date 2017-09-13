package jan26;

abstract class Unit{
	protected String name;
	protected int energe;
	
	abstract public void decEnerge();
	
	public int getEnerge(){
		return energe;
	}
}