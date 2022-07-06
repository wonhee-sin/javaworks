package nestedclass;

import java.lang.Runnable;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	//메서드 -익명 구현 객체
	
	Runnable runner = new Runnable() {
		int num = 10;
		@Override
		public void run() {
			System.out.println(outNum);
			System.out.println(sNum);
			System.out.println(num);
		}
		
	};

}

public class LocalInnerTest2 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		
		out.runner.run();

	}
}
