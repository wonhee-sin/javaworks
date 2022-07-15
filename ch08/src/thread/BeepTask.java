package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

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
	}//run메서드 닫기
	
}//class 닫기
