package loop;

import java.util.Scanner;

public class BankSystem {
	public static void main(String[] args) {
		boolean run =true;
		int balance = 0;
		int selNum;
		int money;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			selNum = sc.nextInt();
			
			if (selNum == 1) {
				
				while(true) {
					System.out.print("얼마를 예금 하시겠습니까?(나가기 '0'키 입력) : ");
					money = sc.nextInt();
					if (money < 1000 && money != 0) {
						System.out.println("천원 이상만 입금 가능합니다.");
						money = 0;
					} else if (money == 0) {
						money =0;
						selNum = 0;
						break;
					} else {
						balance += money;
						money = 0;
						System.out.printf("입금 완료! 잔액 : %,d\n",balance);
					}
				}
				
			} else if (selNum == 2) {
				while(true) {
				System.out.print("얼마를 출금 하시겠습니까?(나가기 '0'키 입력) : ");
				money = sc.nextInt();
				if (money < 0) {
					System.out.println("제대로 입력하세요");
					money = 0;
				} else if (money == 0) {
					money =0;
					selNum = 0;
					break;
				} else if (balance < money){
					System.out.println("잔고 부족 !!");
					money = 0;
				}else {
					balance -= money;
					money = 0;
					System.out.printf("출금 완료! 잔액 : %,d\n", balance);
					} 
				}
			} else if (selNum == 3) {
				System.out.printf("%,d원 \n", balance);
			} else if (selNum == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료!!");
		sc.close();
	}
}
