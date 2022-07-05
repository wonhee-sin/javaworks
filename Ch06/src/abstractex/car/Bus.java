package abstractex.car;

public class Bus extends Car {
	
	public Bus() {
		System.out.println("====== Bus Construct =====");
	}

	@Override
	public void run() {
		System.out.println("========== Bus run ==========");
		
	}

	@Override
	public void refuel() {
		System.out.println("========== Bus refuel ===========");
		
	}
	
	public void takePassenger () {
		System.out.println("========== Take passenger ==========");
	}
	
}
