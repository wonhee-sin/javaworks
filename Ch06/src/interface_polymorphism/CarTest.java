package interface_polymorphism;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		//앞바퀴 교체
		myCar.forntRightTire = new KumTire();
		myCar.frontLeftTire = new KumTire();
		
		myCar.run();
		
	}

}
