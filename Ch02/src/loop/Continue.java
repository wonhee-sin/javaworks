package loop;

public class Continue {
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			if(i==4 || i==8)
				continue;
			System.out.println(i);
		}
		
		//홀수만 출력
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) 
				continue;
			System.out.println(i);
		}
		
		System.out.println("============================================");
		
		for(int i=2; i<10; i++) {
			if(i % 2==1)
				continue;
			for(int j =1; j<10; j++) {
				System.out.println(i*j);
			}
			System.out.println();
		}
	}
}
