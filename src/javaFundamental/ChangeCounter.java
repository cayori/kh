package javaFundamental;

//미국에는 1 센트, 5 센트, 10 센트, 25 센트 50 센트 등 다섯가지 동전이 있습니다. 
//이 동전을 무한정 확보할 수 있다고 하면 이들의 조합으로 어떤 금액도 만들 수 있습니다. 
//특정 금액 m이 주어졌을 때 이 다섯가지 동전을 조합해서 주어진 금액을 만들 수 있는 경우의 수는 몇가지가 있을까요?

public class ChangeCounter {
	
	int cents[] = { 50, 25, 10, 5, 1 };

    public int count(int amount){
        return count(amount, 0);
    }
    private int count(int amount, int idx){
        if (amount == 0)								return 1;
        else if (amount < 0 || idx >= cents.length)		return 0;
        else return count(amount - cents[idx], idx) + count(amount, idx + 1);
    }
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("usage: java ChangeCounter AMOUNT");
			System.exit(0);
		}
		
		int m = Integer.parseInt(args[0]);
		ChangeCounter cc = new ChangeCounter();
		System.out.println("금액 "+m+" 을 바꾸는 경우의 수는 "+cc.count(m)+" 가지가 있습니다");
		
	}
}
