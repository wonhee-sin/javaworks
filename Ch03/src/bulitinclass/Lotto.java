package bulitinclass;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i,j;
		System.out.println(lotto.length);
		
		//로또 번호 생성
		
		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1 ;
			
			for(j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복 발생 " + lotto[i]);
					i--;
				}
			}
		}
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
