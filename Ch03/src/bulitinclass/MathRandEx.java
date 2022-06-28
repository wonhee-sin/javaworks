package bulitinclass;

public class MathRandEx {

	public static void main(String[] args) {
		
		System.out.println("=== 주사위 10번 던지기 ===");
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*6) + 1);
		}
		System.out.println();
		
		System.out.println("=== 문자열 랜덤하게 뽑아내기 ===");
		String[] word = {"나", "너", "무리", "세계", "우주"};
		
		int rnd = (int)Math.random()*5;
		System.out.println(word[rnd]);
	}

}
