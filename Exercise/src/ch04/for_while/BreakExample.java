package ch04.for_while;

public class BreakExample {
	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
		
		while(true) {
			int num = (int)(Math.random()*6) + 1 ;
			
			if(num == 6) {
				break;
			}
		}
		
		double end = System.currentTimeMillis();
		System.out.println((end-start) + "초");
		System.out.println("프로그램 종료");
	}
}
