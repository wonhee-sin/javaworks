package nestedclass;

public class Student {
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println(name);
			System.out.println(eng);
			System.out.println(math);
		}
	}
}
