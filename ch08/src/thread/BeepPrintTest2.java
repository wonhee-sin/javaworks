package thread;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
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
