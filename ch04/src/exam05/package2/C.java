package exam05.package2;

import exam05.package1.A;

public class C {
	
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2   //다른 패키지 접근 불가
		//a.field3
		
		a.method1();
		//a.method2() //다른 패키지 접근 불가
		//a.method3()
	}
}
