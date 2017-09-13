package jan26;

 class A2 {
    void autoPlay(I i) { //i = new B2()/ i = new C();
          i.play();
     }
 }

 interface I {
      public abstract void play();
 }

 class B2 implements I {
     public void play() {
          System.out.println("play in B class");
     }
 }

 class C implements I {
     public void play() {
          System.out.println("play in C class");
     }
 }

class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C());
	}
}






