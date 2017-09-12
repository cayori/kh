package javaFundamental;

//�̱����� 1 ��Ʈ, 5 ��Ʈ, 10 ��Ʈ, 25 ��Ʈ 50 ��Ʈ �� �ټ����� ������ �ֽ��ϴ�. 
//�� ������ ������ Ȯ���� �� �ִٰ� �ϸ� �̵��� �������� � �ݾ׵� ���� �� �ֽ��ϴ�. 
//Ư�� �ݾ� m�� �־����� �� �� �ټ����� ������ �����ؼ� �־��� �ݾ��� ���� �� �ִ� ����� ���� ����� �������?

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
		System.out.println("�ݾ� "+m+" �� �ٲٴ� ����� ���� "+cc.count(m)+" ������ �ֽ��ϴ�");
		
	}
}
