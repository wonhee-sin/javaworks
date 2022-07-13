package ch04.for_while;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int selcNo = scanner.nextInt();
			
			switch(selcNo) {
				case 1 : 
					System.out.print("예금액>");
					balance += scanner.nextInt();
					break;
				case 2 : 
					System.out.print("출금액>");
					balance -= scanner.nextInt();
					break;
				case 3 : 
					System.out.print("잔액>");
					System.out.println(balance);
					break;
				case 4 : 
					System.out.print("종료");
					run =false;
					break;
			}
			
			System.out.println();
		}
	}

}
