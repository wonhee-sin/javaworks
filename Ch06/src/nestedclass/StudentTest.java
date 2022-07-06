package nestedclass;

public class StudentTest {
	
	public static void main(String[] args) {
			Student jang = new Student("장그래");
	
	Student.Score score = jang.new Score();
	
	score.eng = 88;
	score.math = 73;
	score.showInfo();
	}

}
