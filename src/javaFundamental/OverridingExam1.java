package javaFundamental;

class Parent{
	String msg = "Parent Class";
	
	public String getMsg() {
		return msg;
	}
}

class Child extends Parent{
	String msg = "Child Class";

	public String getMsg() {
		return msg;
	}
}

public class OverridingExam1 {
	public static void main(String[] args) {
		
		Child cd = new Child();
		System.out.println("cd : "+cd.getMsg());
		
		Parent pt = new Child();
		System.out.println("pt : "+pt.getMsg());
		
		Parent ct = new Parent();
		System.out.println("ct : "+ct.getMsg());
		
//		Child xt = new Parent();
//		System.out.println("cd : "+xt.getMsg());
	}
}
