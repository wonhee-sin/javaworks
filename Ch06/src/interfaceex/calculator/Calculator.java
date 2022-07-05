package interfaceex.calculator;

public interface Calculator {
	//인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환함.
	int ERROR = -99999;
	
	//abstract 예약어를 명시하지 않아도 컴파일 과정에서 추상메서드로 변환됨.
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}
