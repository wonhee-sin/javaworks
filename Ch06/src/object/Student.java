package object;

public class Student {
	private String studentNum;	//학번
	
	public Student (String studentNum) {
		this.studentNum = studentNum;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		
		return studentNum.hashCode();
	}





	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}
