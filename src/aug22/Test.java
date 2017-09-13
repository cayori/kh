package aug22;

class Example {
    int x;
    public Example(int x) {
	this.x = x; 
}
}
 class Test {
    public static void main(String args[]) {
    	Example x1 = new Example(10);
    	Example x2 = new Example(10);
           method(x1, x2);
           System.out.println(x1.x + ", " + x2.x);
    }
    public static void method(Example v1, Example v2) {
           v2.x = 20;
           v1=v2;
    }
}