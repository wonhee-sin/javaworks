package system;

public class SystemTime {

	public static void main(String[] args) {
		
		//수행 시간 측정
		long start = System.nanoTime();
		
		//1부터 백만까지 더하기
		int sum = 0;
		for(int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		System.out.println(sum);
		System.out.println(end - start);
	}

}
