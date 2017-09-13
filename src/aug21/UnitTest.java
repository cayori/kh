package aug21;

public class UnitTest {
	public static void main(String[] args) {
		Unit u = new Zerg("Hydralisk", false);
		u.decEnergy();
		System.out.println(u.name+" 의 energy : "+u.getEnergy());
		
		u = new Protoss("Corsair", true);
		u.decEnergy();
		System.out.println(u.name+" 의 energy : "+u.getEnergy());
		
		u = new Terran("Marine", false);
		u.decEnergy();
		System.out.println(u.name+" 의 energy : "+u.getEnergy());
	}
}
