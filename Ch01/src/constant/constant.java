package constant;

public class constant {

	public static void main(String[] args) {
		// 상수 - 병하지 않는 값 (1년 12개월, 원주율 3.14)
		//final 키워드 사용
		final int MONTH = 12;
		final int MAX_NUM = 100;
		final int MIN_NUM = 1;
		
		//MONTH = 6; final을 붙이면 상수가 되서 변경할 수 없다.
		// MAX_NUM = 1000; 상수이므로 변경 불가
		
		System.out.println(MONTH);
		System.out.println(MAX_NUM);
		
		//원의 넓이 계산하기
		//area = radius * radius * PI
		
		int radius = 5;
		double area = 0.0;
		final double PI = 3.14159265359;
		
		//연산 처리
		area = radius * radius * PI;
		
		System.out.println("원의 넓이는 " + area + "입니다.");
		
	}

}
