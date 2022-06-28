package information_hiding;

public class MydateTest {
	public static void main(String[] args) {
		// Mydate 클래스의 객체 생성
		
		Mydate date = new Mydate();
		System.out.println(date);
		
		date.setYear(2028);
		System.out.println(date.getYear());
		
		date.setMonth(2);
		System.out.println(date.getMonth());
		
		date.setDay(29);
		System.out.println(date.getDay());
	}
}
