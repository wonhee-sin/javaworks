package singleton;

public class CarFactory {

	private static CarFactory instence = new CarFactory();
	private static CarFactory instence2 = new CarFactory();
	
	private CarFactory() {} //외부에서 객체추가 막음
	
	public static CarFactory getInstance() {
		return instence;
	}
	public static CarFactory getInstance2() {
		return instence2;
	}
	
	//차 생성
	public Car createCar() {
		Car car = new Car(); //차 객체 생성
		return car;
	}
}
