package aug22;
import java.util.Vector;

class Tv8 extends Product4{
	Tv8()	{super(100);	}
	public String toString()	{return "Tv";	}
}
class Computer3 extends Product4{
	Computer3()	{super(200);}
	public String toString() {return "Computer";}
}
class Audio2 extends Product4{
	Audio2()	{super(50);}
	public String toString() {return "Audio";}
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product4> items = new Vector<Product4>();
	
	void buy(Product4 p) {
		if(money<p.price)	System.out.println("잔액부족");
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			items.add(p);
			System.out.println(p.toString()+" 을/를 구입하셨습니다");
		}
	}
	void refund(Product4 p) {
		if(items.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p.toString()+" 을/를 반품하셨습니다");
		}else System.out.println("해당하는 상품이 없습니다");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
//		for(Product4 p : items)	{
//			if(p == null) break;
//			sum += p.price;
//			itemList += p.toString();
//			itemList += ", ";
		
		for(int i=0; i<items.size(); i++) {
			Product4 p = (Product4)items.get(i);
			sum += p.price;
			itemList += p.toString();
			if(i == items.size()-1) break;
			itemList += ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 만원 입니다.");
		System.out.println("보유하신 bonusPoint는 "+bonusPoint+" 점 입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다");
		
	}
}



public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = 		new Buyer3();
		Tv8 tv = 		new Tv8();
		Computer3 com = new Computer3();
		Audio2 audio = 	new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
