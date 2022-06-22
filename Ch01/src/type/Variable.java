package type;

public class Variable {

	public static void main(String[] args) {
		String name;
		name = "한지수";
		
		int grade;
		grade = 2;
		
		//int class; 예약어는 변수로 사용할 수 없음.
		int schoolClass = 3;
		
		System.out.println(name + "는 " + grade + "학년 " + schoolClass +"반 입니다.");
	}

}
