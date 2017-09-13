package jan22;

class StaticTest5{

	int a = 100;
	static int b = 200;
	static{
		b = 5000;
		c = 10000;
	}
	//d = 100000;
	public static void main(String[] args){
		System.out.println(c);
	}
	static int c;
	//int d;
}
