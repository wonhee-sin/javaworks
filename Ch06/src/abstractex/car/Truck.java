package abstractex.car;

public class Truck extends Car {
	public Truck() {
		System.out.println("====== Truck Construct =====");
	}

	@Override
	public void run() {
		System.out.println("========== Truck run ===========");
		
	}

	@Override
	public void refuel() {
		System.out.println("========== Truck refuel ==========");
		
	}
	
	void load () {
		System.out.println("========== Truck loaded ==========");
	}
	
}
