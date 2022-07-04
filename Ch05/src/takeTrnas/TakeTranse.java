package takeTrnas;

public class TakeTranse {

	public static void main(String[] args) {
		Student sohee = new Student("박소희",10000);
		Student daeho = new Student("대호",20000);
		
		Bus bus100 = new Bus("bus100");
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		sohee.take(bus100, 1200);
		daeho.take(bus100, 1200);
		
		sohee.take(kakaoTaxi, 3400);
		daeho.take(kakaoTaxi, 5500);
		
		sohee.showInfo();
		daeho.showInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();

	}

}
