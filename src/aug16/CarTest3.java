package aug16;

class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){this("white", "auto", 4);}
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car3(Car3 c){
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;		
	}	
}

public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println("c1의 color : "+c1.color+", gearType : "+c1.gearType+", door : "+c1.door);
		System.out.println("c2의 color : "+c2.color+", gearType : "+c2.gearType+", door : "+c2.door);

		c1.door = 100;
		c1.color = "red";
		System.out.println("c1.door = 100; 수행 후");
		System.out.println("c1의 color : "+c1.color+",\t gearType : "+c1.gearType+",\t door : "+c1.door);
		System.out.println("c2의 color : "+c2.color+",\t gearType : "+c2.gearType+",\t door : "+c2.door);

	}
}
