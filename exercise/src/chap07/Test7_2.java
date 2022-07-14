package chap07;

public class Test7_2 {

	public static void main(String[] args) {
		//1. O, X, O, O
		
		//2.
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;  //자동 형변환
		
		snowTire.run();
		tire.run();  
		
		//3. 2
		/*
		 A a = new B();
		 B b = (B)a;  //a가 B 클래스의 객체
		 
		 */
		
		//4. X, O, O, O, X, X
		
		//5.
		Controller controller = new Controller();
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
	}
}








