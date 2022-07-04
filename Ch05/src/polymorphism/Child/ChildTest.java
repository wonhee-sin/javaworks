package polymorphism.Child;

public class ChildTest {
	public static void main(String[] args) {
		
		//Child child = new Child();
		
		//Parent parent = child;			//자동 타입 변환
		
		Parent child = new Child();
		
		child.method();
		child.method2();		//자식 클래스의 메서드가 호출됨
//		parent.method3();		//호출 불가
		
	}
}
