package thread;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//"띵"" 문자열 5번 출력하기 - > 1초 대기간격
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);		// 1000ms -> 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //catch문 닫기
		}//for문 닫기
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch문 닫기
		}//for문 닫기
		
	}//메인 메서드 닫기

}//클래스 닫기
