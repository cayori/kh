package feb01;

class GenericEx1Main{

	public static void main(String[] args){
		GenericEx1<String> t = new GenericEx1<String>();
		
		String[] ss = {"��","��","��"};
		t.set(ss);
		t.print();

		GenericEx1<Integer> t1 = new GenericEx1<Integer>();
		Integer[] s = {1,2,3};
		t1.set(s);
		t1.print(); 
	}
}







