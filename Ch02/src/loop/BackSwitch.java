package loop;

import java.util.Scanner;


public class BackSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택>");
			int selNum = sc.nextInt();
			switch(selNum) {
			case 1:
				System.out.print("에금액>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 누르셨습니다. 다시 입력해주세요.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
		sc.close();
	}
}
