package system;

public class ExitExample {
	public static void main(String[] args) {
		for (int i=0; i < 10; i++) {
			if(i==5) {
				System.exit(0); //정상 종료 
				break;
			}
			System.out.println(i);
		}
		System.out.println("반복 종료");
	}
}
