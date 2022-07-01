package arrayList;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "lee");
		Student s2 = new Student(1002, "kim");
		
		s1.addSubject("수학",100);
		s1.addSubject("국어", 80);
		s1.addSubject("영어", 92);
		
		s2.addSubject("Java", 77);
		s2.addSubject("javascript", 88);
		
		s1.showStudentInfo();
		s2.showStudentInfo();
	}
}
