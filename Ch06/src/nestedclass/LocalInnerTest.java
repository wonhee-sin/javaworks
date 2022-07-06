package nestedclass;

import java.lang.Runnable;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	//메서드
	Runnable getRunnable() {
		int num = 10; //인터페이스 상수
		
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {

				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				
			}
			
		}
		
		
		return new MyRunnable();
	}
}







public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		Runnable runner = outer.getRunnable(); //자동 형변환
		runner.run();

	}

}
