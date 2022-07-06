package interface_polymorphism;

public class Car {
	//필드
	Tire frontLeftTire = new HanTire();
	Tire forntRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	
	//메서드
	void run() {
		frontLeftTire.roll();
		forntRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
