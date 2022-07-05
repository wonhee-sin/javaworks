package interfaceex.vehivle;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("The Taxi run!");
		
	}
	
	public void checkFare() {
		System.out.println("check fare");
	}

}
