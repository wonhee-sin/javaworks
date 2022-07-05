package tire;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run () {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		frontLeftTire.showStatus();
		frontRightTire.showStatus();
		backLeftTire.showStatus();
		backRightTire.showStatus();
	}
	
	void changeTire(int locate, int kind) {
		Tire ct = null;
		
		if (kind == 1) {
			ct = new KumhoTire();
		} else if (kind == 2) {
			ct = new HankookTire();
		}
		
		switch(locate) {
		case 1 : frontLeftTire = ct;
		break;
		case 2 : frontRightTire = ct;
		break;
		case 3 : backLeftTire = ct;
		break;
		case 4 : backRightTire = ct;
		break;
		}
	}
}
