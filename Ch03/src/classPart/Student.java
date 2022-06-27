package classPart;

public class Student {
	//필드(멤버 변수)
	int studentId; //학번
	String studentName; //이름
	
	//기본 생성자 -객체의 초기화 생략할 수 있음
	//클래스의 이름과 같으나, 함수는 아님 - 반환값이 없음
	Student(){ 
		
	}
	
	void showInfo() {
		System.out.println(studentId + studentName);
	}
}
