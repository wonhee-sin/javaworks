package classPart;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("추신수");
		Person p3 = new Person("장그래" , 165F, 55F);
		
		p1.height = 170.3F;
		p1.name = "다있소";
		p1.weight = 70.1F;
		
		p2.height = 190F;
		p2.weight = 100F;
		
		p1.showInfo();
		p2.showInfo();
		
		p2.name = "신수추";
		p2.showInfo();
		
		p3.showInfo();
	}
}
