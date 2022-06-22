package constant;

import java.util.Scanner;

public class kmToMile {
	public static void main(String[] args) {
		//km를 Mile로 변환
		
		final double RATE_KPH_MPH = 1.609344;
		double kph = 0.0;
		double mph = 0.0;
		Scanner Scan = new Scanner(System.in);
		System.out.printf("당신의 구속을 입력하세요(kph) ");
		kph = Scan.nextDouble();
		//연산 - mph = kph / 상수
		mph = kph / RATE_KPH_MPH;
		
		
		
		System.out.println(mph);
		//printf ("문자열 포멧",객체(변수))  정수-%d 실수-%f
		System.out.printf("공의 속도는 %.2f[MPH]입니다.", mph);
		
		Scan.close();
	}
}
