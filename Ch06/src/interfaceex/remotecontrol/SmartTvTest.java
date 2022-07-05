package interfaceex.remotecontrol;

public class SmartTvTest {

	public static void main(String[] args) {
		
		SmartTv tv = new SmartTv();
		//구현한 객체를 인터페이스 타입에 대입
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		searchable.search("https://www.naver.com");
		rc.turnOff();

	}

}
