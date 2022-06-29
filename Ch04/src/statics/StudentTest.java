package statics;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.setName("이대한");
		
		System.out.println(Student.serialNum);
		Student.serialNum++; //1001
		
		System.out.println(Student.serialNum);
		
		Student jang = new Student();
		jang.setName("장민국");
		Student.serialNum++;//1002
		
		System.out.println(Student.serialNum);

	}

}
