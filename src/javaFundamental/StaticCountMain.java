package javaFundamental;

public class StaticCountMain {
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("sc1의 c     : "+sc1.c);
		System.out.println("sc1의 count : "+StaticCount.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println("sc2의 c     : "+sc2.c);
		System.out.println("sc2의 count : "+StaticCount.count);
		
		StaticCount sc3 = new StaticCount();
		System.out.println("sc3의 c     : "+sc3.c);
		System.out.println("sc1의 count : "+StaticCount.count);
	}
}
