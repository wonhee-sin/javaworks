package classPart;

public class Person {
	//필드
	String name;
	float height;
	float weight;
	
	//기본 생성자
	
	public Person() {}
	
	//매개변수가 있는 생성자
	public Person(String n) { //이름을 외부에서 매개변수 입력
		name = n;
	}
	
	public Person(String n, float h, float w) { //이름을 외부에서 매개변수 입력
		name = n;
		height = h;
		weight = w;
	}
	
	//메서드
	public void showInfo() {
		System.out.println(name  + height + weight);
	}
}
