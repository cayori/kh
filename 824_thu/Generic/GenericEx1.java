package feb01;

import static java.lang.System.out;

class GenericEx1<T> { //String, Integer

	T[] v;
	
	public void set(T[] n){
		v = n;
	}
	public void print(){
		for(T s : v)
			out.println(s);
	}
}
