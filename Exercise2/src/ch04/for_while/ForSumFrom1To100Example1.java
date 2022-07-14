package ch04.for_while;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;				// 12번에서 sum을 쓰기 때문에(for문 밖에서 사용하기 때문에) for문 밖에 정의함.
		
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum);

	}

}
