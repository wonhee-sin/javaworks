package thread;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드가 동시에 실행
		//익명 객체로 구현
		
		Thread thread = new Thread (new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}//catch문 닫기
				}//for문 닫기
				
			}//run 메서드 닫기		
		});//thead 익명객체 생성 닫기
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);		// 1000ms -> 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //catch문 닫기
		}//for문 닫기
	}//메인 메서드 닫기

}//클래스 닫기
