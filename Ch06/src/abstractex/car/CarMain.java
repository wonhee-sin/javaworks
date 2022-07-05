package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		Car bus = new Bus();
		Car truck = new Truck();
		
		System.out.println();
		
		bus.run();
		bus.refuel();
		bus.stop();
		Bus b1 = (Bus)bus;
		b1.takePassenger();
		
		System.out.println();
		
		truck.run();
		truck.refuel();
		truck.stop();
		Truck t1 = (Truck)truck;
		t1.load();
		
	
		
	}

}
