package annonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
				new Person() {
					void study() {
						System.out.println("Do study");
					}
					@Override
					void wake () {
						System.out.println("Wake up at 8.");
						study();
					}
				}
			);
	}
}
