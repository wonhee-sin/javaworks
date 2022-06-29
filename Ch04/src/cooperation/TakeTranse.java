package cooperation;

public class TakeTranse {

	public static void main(String[] args) {
		
		//생성
		Person p1 = new Person("minsu", 10000);
		Person p2 = new Person("jinsu", 15000);
		Person p3 = new Person("gildong", 20000);
		
		Bus b1711 = new Bus(1711);
		Subway s1 = new Subway("1호선");
		
		p1.takeBus(b1711);
		p1.showInfo();
		p2.takeBus(b1711);
		p2.showInfo();
		p3.takeSubway(s1);
		p3.showInfo();
		
		b1711.showInfo();
		s1.showInfo();

	}

}
