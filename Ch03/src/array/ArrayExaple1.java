package array;

public class ArrayExaple1 {
	public static void main(String[] args) {
		int[] korScore = new int[3];
		korScore[0] = 70;
		korScore[1] = 80;
		korScore[2] = 90;
	
				
		//배열의 개수
		System.out.println(korScore.length);
		
		//특정한 데이터 죄회(출력)
		System.out.println(korScore[1]);
		
		//수정, 변경
		korScore[2] = 95;
		System.out.println(korScore[2]);
		
		//전체 조회
		System.out.println(korScore); //메모리의 주소
		
		for(int i = 0; i <korScore.length; i++) {
			System.out.println(korScore[i]);
		}
	}
}
