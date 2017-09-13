package aug22;

class Product4{
	int price;
	int bonusPoint;
	
	Product4()	{this(0);}
	Product4(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0f);
	}
}
class Tv7 extends Product4{
	Tv7()	{super(100);}
	public String toString() {return "Tv";}
}
class Computer2 extends Product4{
	Computer2()	{super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product4{
	Audio()	{super(50);}
	public String toString() {return "Audio";}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product4[] items = new Product4[10];
	int i=0;
	
	void buy(Product4 p) {
		if(money<p.price)	System.out.println("잔액부족");
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			items[i++] = p;
			System.out.println(p.toString()+" 을/를 구입하셨습니다");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
//		for(Product4 p : items)	{
//			if(p == null) break;
//			sum += p.price;
//			itemList += p.toString();
//			itemList += ", ";
		
		for(int i=0; i<items.length; i++) {
			sum += items[i].price;
			itemList += items[i].toString();
			if(items[i+1] == null) break;
			itemList += ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 만원 입니다.");
		System.out.println("보유하신 bonusPoint는 "+bonusPoint+" 점 입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다");
		
	}
}



public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv7 tv = new Tv7();
		Computer2 com = new Computer2();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}
