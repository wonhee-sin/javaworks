package ch01;

public class typeConversion2 {

	public static void main(String[] args) {
		// 사칙연산
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x + y);
		System.out.println(x / y);  //int 형으로 계산되므로 값이 손실된다.
		System.out.println(x % y);
		
		System.out.println((double)x / y); //double로 자동 형변환함
		
	}

}
