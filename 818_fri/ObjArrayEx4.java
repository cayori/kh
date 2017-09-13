package jan25;

class ObjArrayEx4 {
	public static void main(String[] args){
		int[][] test; // 다차원 배열 선언
		test = new int[2][3];// 다차원 배열  생성
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		//--------------------- 1행 초기화 끝
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		//--------------------- 2행 초기화 끝
		//    test[0]            test[1]
		//    test[0][0]        test[1][0]
		//    test[0][1]        test[1][1]
		//    test[0][2]        test[1][2]

		

	}
}

