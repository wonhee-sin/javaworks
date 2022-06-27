package classPart;

public class StudentTest {
	public static void main(String[] args) {
		//클래스의 객체 사용
		Student std1 = new Student();
		
		//std1 멤버에 점근 (점 연산자로 사용)
		std1.studentId = 100;
		std1.studentName = "다있소";
		
		System.out.println(std1.studentId);
		System.out.println(std1.studentName);
		
		Student std2 = new Student();
		std2.studentId = 101;
		std2.studentName = "장그래";
		
		System.out.println(std2.studentId);
		System.out.println(std2.studentName);
		
	}
}
