package jan25;

//가변배열(차수가 정해지지 않은 상태에서.....)
class ObjArrayEx6
{
	public static void main(String[] args) 
	{
		int[] t1 = {1,100}; //길이가 2개인 1차원 배열 선언과 생성
		int[] t2 = {20,200,2000,20000}; //길이가 4개인 1차원 배열 선언과 생성
		
		int[][] test = new int[2][];// 선언과 생성 , 가변배열
		test[0] = t1; // 첫번째 행에 준비한 1차원 배열 대입 test[0]경우에는 2차원 차수 2
		test[1] = t2; // 두번째 행에 준비한 1차원 배열 대입 test[1]             2              4
		//    test[0]     test[1]
		//       l              l
		//    1,100       20,200,2000,20000

		for(int i = 0 ; i < test.length ; i++) //2
		{
			for(int j = 0 ; j < test[i].length ; j++)  //i=0 2, i=1 4
				System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			System.out.println("-----------------");

		}
	}
}








