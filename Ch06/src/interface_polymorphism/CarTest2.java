package interface_polymorphism;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 mycar = new Car2();
		mycar.run();
		
		//앞바퀴 교체
		mycar.tires[0] = new KumTire();
		mycar.tires[1] = new KumTire();
		
		System.out.println();
		mycar.run();
	}

}
