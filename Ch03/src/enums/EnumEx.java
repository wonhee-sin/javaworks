package enums;


enum Level { //열거형 상수
	LOW,
	MIDDLE,
	HIGH
}


public class EnumEx {

	public static void main(String[] args) {
		
		Level lv01 = Level.HIGH; //상수이므로 new를 사용하지 않는다.
		
		switch(lv01) {
		case LOW :
			System.out.println("Low Level");
			break;
		case MIDDLE :
			System.out.println("Middle Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		default:
			break;
		
		}
		
	}

}
