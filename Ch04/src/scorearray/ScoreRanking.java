package scorearray;

public class ScoreRanking {

	public static void main(String[] args) {
		
		int[] score = {100,20,30,60,40};
		int[] rank = new int[5];
		
		for ( int i = 0; i < score.length; i++) {
			int count = 1;
			for ( int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) 
					count++;	
			}
			rank[i] = count;
		}
		for (int r : rank) {
			System.out.print(r + " ");
		}
	}

}
