package aug22;

class A3{
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
	}
}
interface I2{
	public abstract void methodB();
}
class B3 implements I2{
	public void methodB() {
		System.out.println("methodB in B class");
	}
}
class InstanceManager{
	public static I2 getInstance() {
		return new B3();
	}
}


public class InterfaceTest3 {

}
