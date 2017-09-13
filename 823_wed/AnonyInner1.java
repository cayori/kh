package jan26;

abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
  }
class  AnonyInner1{

	TestAbst inn = new TestAbst (){
		public void printData(){ // 미완성된 것을 완성한다.

			System.out.println("data : "+data);
		}
	};

	public static void main(String[] args){
		AnonyInner1 ai = new AnonyInner1();
		ai.inn.printData();
	}
  }
