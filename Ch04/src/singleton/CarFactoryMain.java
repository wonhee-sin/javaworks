package singleton;

public class CarFactoryMain {

	public static void main(String[] args) {
		
		
		CarFactory factory = CarFactory.getInstance();
		CarFactory factory2 = CarFactory.getInstance();
		
		CarFactory factory3 = CarFactory.getInstance2();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		Car Sonata = factory2.createCar();
		
		
		System.out.println("차량 번호 :" + mySonata.getCarNum());
		System.out.println("차량 번호 :" + yourSonata.getCarNum());
		
		System.out.println("차량 번호 :" + Sonata.getCarNum());
		
		System.out.println(factory);
		System.out.println(factory2);
		
		System.out.println(factory3);
	}

}
