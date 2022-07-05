package interfaceex.remotecontrol;

public abstract class MyClassTest {

	public static void main(String[] args) {
		//rc 필드를 사용
		
		System.out.println("1)-----------------------------");
		MyClass myclass = new MyClass();
		myclass.rc.turnOn();
		myclass.rc.setVolumn(5);
		
		System.out.println("2)-----------------------------");
		//생성자의 매개 변수
		MyClass myclass2 = new MyClass(new Audio());
		
		System.out.println("3)-----------------------------");
		//메서드 로컬 변수로 사용
		MyClass myclass3 = new MyClass();
		myclass3.methdA();
		
		System.out.println("4)-----------------------------");
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
	}

}
