package interfaceex.remotecontrol;

public interface RemoteControl {
	
	//인터페이스 상수
	public int MAX_VOL = 10;
	public int MIN_VOL = 0;
	
	//추상 메서드
	void turnOn();
	
	void turnOff();
	
	void setVolumn(int vol);
	
	//일반 메서드 - default 키워드 사용
	
	default void setMute(boolean mute) { //버전 8 이상에서 사용가능.
		if (mute) {	//mute == true
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메서드(static)
	
	static void changeBattery () {
		System.out.println("건전지를 교환합니다.");
	}
}
