package operator;

public class operator2 {
	public static void main(String[] args) {
		//증가, 감소 연산자
		int num = 10;
		int val = 0;
		
		//val = num++; //val = num, num = num + 1
		val = ++num; // num = num + 1, val = num
		System.out.println(val);
		System.out.println(num);
		
		// val = num--;
		val = --num;
		System.out.println(val);
		System.out.println(num);
		
		//산술 연산자 - 총점과 평균
		int mathScore = 90, engScore = 75;
		int totalScore;
		double avgScore;
		
		//총점
		totalScore = mathScore + engScore;
		System.out.printf("총점은 %d 입니다.\n",totalScore);
		avgScore = (double)totalScore / 2;
		System.out.printf("평균은 %.1f 입니다.\n",avgScore);
		
	}
}
