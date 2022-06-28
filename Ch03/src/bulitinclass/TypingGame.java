package bulitinclass;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"river", "mountain", "sky" , "earth", "moon", "tree", "flower", "cow", "pig", "horse", "blue", "light", "sea", "eyes", "small"};
		String[] question = new String[10];
		
		int n = 1;
		long start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영어타자 게임, 준비되면 엔터");
		scan.nextLine();
		
		for (int i = 0; i < question.length; i++) {
			question[i] = words[(int)(Math.random()*words.length)];
			
			for (int j = 0; j < i; j++) {
				if (question[i] == question[j]) {
					i--;
				}
			}
		}
		
		start = System.currentTimeMillis();
		while(n<11) {
			System.out.println("문제 " + n);
			System.out.println(question[n-1]);
			String answer = scan.nextLine();
			
			if(answer.equals(question[n-1])) {
				System.out.println("통과!!");
				n++;
			}else {
				System.out.println("오타! 다시도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임 소요 시간은 " + (end - start)/1000 + "초 입니다.");
		scan.close();
	}

}
