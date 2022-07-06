package nestedclass;

class A{
	A(){System.out.println("A 객체가 생성됨");}
	
	//필드 - 인스턴스 클래스 , static 사용할 수 없다.
	class B {
		int field;
		B() { System.out.println("B 객체가 생성됨"); }
		void method1() {}
	}
	
	//필드 -정적 클래스
	
	static class C {
		int field1;
		static int field2;
		C() { System.out.println("C 객체가 생성됨"); }
		void method1() {};
		static void method2 () {};
	}
	
	void method() { 
		class D{ //로컬 클래스 -메서드 내에 선언된 클래스
			int field;
			// 로컬에서 Static 사용 불가
			D() {System.out.println("D 객체가 생성됨");}
			void method1() {};
		}
		D d = new D();
		d.field = 3;
		d.method1();
		
	}
}


public class NestedClass {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 클래스 객체
		A.B b = a.new B();
		b.field = 4;
		b.method1();
		
		//정적 클래스
		
		A.C c = new A.C();
		c.field1 = 5;
		A.C.field2 = 6;
		c.method1();
		A.C.method2();
		a.method();
		

	}

}
