package ch04.if_switch;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("score is higher than 90");
			System.out.println("grade is A");
		} else {		// if  score < 90
			System.out.println("score is lower than 90");
			System.out.println("grade is B");
		}

	}

}
