package interfaceex.remotecontrol;

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	
	
	//생성자
	MyClass() {}
	
	MyClass (RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메서드의 지역변수 사용
	void methdA () {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolumn(5);
	}
	
	//메서드의 매개 변수로 사용
	void methodB (RemoteControl rc) {
		rc.turnOn();
		rc.setVolumn(6);
	}
	
}
