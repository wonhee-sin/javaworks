package chap13;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			//name 비교해도 가능 - hashCode() 이므로..
			if(std.studentNum == studentNum) {
				return true;
			}
		}
		return false;
	}
}
