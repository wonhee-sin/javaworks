package interface_inherit;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.x();
		myclass.y();
		myclass.myMethod();
		
		X x = myclass;
		x.x();
		
		Y y = myclass;
		y.y();
		
		MyInterface iClass = myclass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
		
		
	}

}
