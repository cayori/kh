package aug22;

class Car{
	protected int speed;
	protected String name;

	Car(){this(0,null);}
	Car(int speed, String name){
		this.speed = speed;
		this.name = name;
	}
	public void speedUp(){
		speed++;
	}
	public void speedDown(){
		speed--;
	}
	public void stop(){
		speed = 0;
	}
	public void display(){
		System.out.println("speed: "+speed+", name: "+name);
	}
}

class Taxi extends Car{
	private int charge;
	private boolean fare;
	private String company;

	Taxi()	{this(null);}
	Taxi(String company)	{this(0,null, company);}
	Taxi(int speed, String name, String company){
		super(speed, name);
		this.company = company;
	}

	public void accounts(){
		if(fare) charge = speed * 12;
		else	 charge = speed * 10;
	}
	public void setFare(boolean b){
		fare = b;
	}
	public void display(){
		System.out.println("회사: "+company+", 요금: "+charge+", 할증여부:"+fare);
	}
}


public class Yap {
    String s;
    public static void main(String[] args) {
        Yap t = new Yap();
        t.go();
    }
    void Test() {
         s = "constructor";
    }
    void go() {
         System.out.println(s);
    }
}   