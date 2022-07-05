package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
//		Phone p1 = new Phone(); 추상클래스는 객체생성이 불가
		SmartPhone p1 = new SmartPhone("gildong");
		
		
		p1.powerOff();
		p1.powerOn();
		p1.internetSearch();
		
		System.out.println(p1.owner);

	}

}
