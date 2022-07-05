package interfaceex.vehivle;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("The bus run!");
		
	}
	
	public void checkFare() {
		System.out.println("check fare");
	}

}
