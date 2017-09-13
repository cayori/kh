package aug16;

class MyClass2{
	private int age = 0;
	private String name = "기본이름";
	
	//생성자 세트
	public MyClass2() {}
	public MyClass2(int age) {
		this.age = age;
	}
	public MyClass2(String name) {
		this.name = name;
	}
	public MyClass2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public MyClass2(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	
	
}

public class MyClass2Test {
	public static void main(String[] args) {
		MyClass2 mc1 = new MyClass2();
		MyClass2 mc2 = new MyClass2("아라치");
		MyClass2 mc3 = new MyClass2("마루치",46);
		MyClass2 mc4 = new MyClass2(23,"오자바");
		
		System.out.println(mc1.getName()+", "+mc1.getAge());
		System.out.println(mc2.getName()+", "+mc2.getAge());
		System.out.println(mc3.getName()+", "+mc3.getAge());
		System.out.println(mc4.getName()+", "+mc4.getAge());
	}
}
