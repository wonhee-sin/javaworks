package variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 < 10) {
			int v2;
			v2 = v1 - 10;
		}
		// int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생.(v2는 if문 안에서 선언된 지역 변수 if문 안에서만 사용 가능)
	
	
	}
}
