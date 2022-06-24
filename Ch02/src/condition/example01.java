package condition;

public class example01 {

	public static void main(String[] args) {
		//제한 속도
		int limitSpeed = 55;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!! 과태료 10만원 부과 대상");
		}else {
			System.out.println("안전 속도 준수!!");
		}
		System.out.printf("시속 %dKm 입니다.\n",limitSpeed);
	}
	
}
