package jan26;

class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA(); // 제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
	}
}

 class A3 {
    void methodA() {
          I2 i = InstanceManager.getInstance();
		  i.methodB();
     }
 }

 interface I2 {
      public abstract void methodB();
 }

 class B3 implements I2 {
     public void methodB() {
          System.out.println("methodB in B class");
     }
 }

 class InstanceManager {
	public static I2 getInstance() {
		return new B3();
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 