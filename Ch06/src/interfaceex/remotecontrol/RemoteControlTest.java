package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		//인터페이스형 타입으로 객체 생성
		//Television tv = new Television();
		
		RemoteControl.changeBattery();
		
		System.out.println();
		
		RemoteControl tv = new Television();
		
		tv.turnOn();
		tv.setVolumn(100);
		tv.setVolumn(-22);
		tv.setVolumn(7);
		tv.setMute(true);
		tv.setMute(false);
		RemoteControl.changeBattery();
		tv.turnOff();
		
		System.out.println();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolumn(14);
		audio.setMute(false);
		audio.setMute(true);
		RemoteControl.changeBattery();
		audio.turnOff();
	}

}
