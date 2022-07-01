package ch02.PrimitiveType;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if (stop) { //stop 안에 true가 들어 있으므로 이건 참. if문안에 실행문이 실행된다.
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		boolean go = false;
		if (go) { //stop 안에 true가 들어 있으므로 이건 참. if문안에 실행문이 실행된다.
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
