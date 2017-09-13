package aug14;

class Card{
	String kind; // 4가지
	int number; // 1~13
	static int width = 100;
	static int height = 250;
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
			c1.kind = "Heart";
			c1.number = 7;
		Card c2 = new Card();
			c2.kind = "Spade";
			c2.number = 4;
			
		System.out.println("c1은 "+c1.kind+", "+c1.number+" 이며, 크기는 "+Card.width+","+Card.height+" 입니다");
		System.out.println("c2는 "+c2.kind+", "+c2.number+" 이며, 크기는 "+Card.width+","+Card.height+" 입니다");
		
		System.out.println("c1 카드의 크기를 50*80 으로 변경합니다.");
			c1.width = 50;
			c1.height = 80;
			
		System.out.println("c1은 "+c1.kind+", "+c1.number+" 이며, 크기는 "+Card.width+","+Card.height+" 입니다");
		System.out.println("c2는 "+c2.kind+", "+c2.number+" 이며, 크기는 "+Card.width+","+Card.height+" 입니다");
		
		
	}
}
