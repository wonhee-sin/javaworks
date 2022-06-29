package scorearray;

public class ScoreExample {

	public static void main(String[] args) {
		//5명의 자바 과목 점수
		int[] score = {90, 80, 30, 60, 100};
		int sum = 0;
		//총점
			for(int i = 0; i < score.length; i++) {
				sum += score[i];
			}
			System.out.printf("총점은 %d\n", sum);
		//평균
			double avg = (double)sum / score.length;
			System.out.printf("평균은 %.2f\n", avg);
		//최고 점수
			int max = score[0];
			for (int i = 0; i < score.length; i++) {
				if (max < score[i]) {
					max = score[i];
				}
			}
			System.out.printf("최고점수 %d\n", max);
			
			int min = score[0];
			for (int i = 0; i < score.length; i++) {
				if (min > score[i]) {
					min = score[i];
				}
			}
			System.out.printf("최고점수 %d\n", min);
	}
}
