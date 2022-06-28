package thisExample;

    class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		
		Person son = new Person("손흥민", 31);
		System.out.println(son.name);
		
		System.out.println(son.returnItSelf());
		System.out.println(noName.returnItSelf());
		System.out.println(noName);
	}
}
