package interfaceex.vehivle;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
		
		System.out.println("=========================");
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//checkFare()호출할 수 없음.
		
		System.out.println();

		//강제 타입 변환
		Bus bus2 = (Bus)vehicle;
		
		bus2.run();
		bus2.checkFare();

	}

}
