package loop;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
	
		System.out.println("=============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("=============================");
		while(run) {
			System.out.println("선택> ");
			int selNum = sc.nextInt();		
			if(selNum==1) {
				System.out.println("입금액> ");
				balance += sc.nextInt();
			} else if (selNum == 2) {
				System.out.println("출금액> ");
				balance -= sc.nextInt();
			} else if (selNum == 3) {
				System.out.println("잔고> ");
				System.out.println(balance);
			}else if (selNum==4) {
				run = false;
			}
		}
		sc.close();
		System.out.println("프로그램 종료!!");
	}
	
}
