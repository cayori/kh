package jan21;

//Variable Arguments
class VarTest {
	//argTest()
	//argTest(String n)
	//argTest(String n,String n1)
	public void argTest(String ... n){ //매개변수의 객수에 제한을 두지 않는다...!!! (zero or unlimited)
		for(int i = 0 ; i < n.length ; i++)
			System.out.println("n["+i+"]:"+n[i]);
		System.out.println("--------------------------");
	}
	public static void main(String[] args){
		VarTest vt = new VarTest(); //객체생성
		vt.argTest("Varargs","Test");
		
		vt.argTest("100","600","900","1000");
		vt.argTest();
	}
}

//VarTest
//======
//arfTest()