package ch02.Variable;

public class Exam {

	public static void main(String[] args) {
		/* Q1. 변수에 대한 설명중 맞는것에 o표 틀린 것에 x표 하세요.
		 * 1. 변수는 하나의 값만 저장할 수 있다. ( o )
		 * 2. 변수는 선언 시에 사용한 타입의 값만 저장할 수 있다.( o )
		 * 3. 변수는 변수가 선언된 중괄호{} 안에서만 사용 가능하다.( o )
		 * 4. 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다. ( x )
		 * 
		 * Q2. 변수 이름으로 사용할 수 있는 것에 o표 사용할수 없는 것에 X표 하세요.
		 * 1. moDelName  ( o )
		 * 2. 6hour  ( x )
		 * 3. class  ( x )
		 * 4. $value  ( o )
		 * 5. _age  ( o )
		 * 6. int  ( x )
		 * 
		 * Q3. 컴파일 에러가 발생하는 코드를 찾고, 그 이유를 설명해 보세요.
		 * 1. int sum;
		 * 2. int score1 = 0;
		 * 3. int score2;
		 * 4. sum = score1 + score2; > score2 의 초기값이 설정되지 않았으므로 메모리를 읽을 수 없다.
		 * 
		 * Q4. 변수 사용 범위에 대한 내용입니다. 컴파일 에러가 발생하는 위치를 찾고, 그 이유를 설명해 보세요.
		 * 
		 * int v1 = 0;
		 * if (true) {
		 * 		int v2 = 0;
		 * 		if (true) {
		 * 			int v3 = 0;
		 * 			v1 = 1;
		 * 			v2 = 1;
		 *			v3 = 1;
		 * 		}		
		 * 		v1 = v2 + v3;  > v3가 두번째 if문 안에 선언되있으므로 그 범위 밖에 있는 첫번째 if문 안에서는 사용 할 수없다. v2역시 첫번째 if문을 벗어나게 된다면 역시 사용 할 수 없게 될 것.
		 * }
		 * System.out.println(v1);
*/
	}

}
