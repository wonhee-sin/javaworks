package account_db;

import java.util.Scanner;

public class AccountMain {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		
		boolean run = true;    //실행 변수
		
		while(run) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌조회 | 6.계좌삭제 | 7.계좌복구 | 8.종료");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();  //nextLine()이 자동 줄바꿈이 되어 사용안함
			if(selectNo.equals("1")) {
				dao.CreateAccount();;  //계좌 생성
			}else if(selectNo.equals("2")) {
				dao.getAccountList();    //계좌 목록
			}else if(selectNo.equals("3")) {
				dao.deposit();	    //입금
			}else if(selectNo.equals("4")) {
				dao.withdrow();       //출금
			}else if(selectNo.equals("5")) {
				dao.searchAccount();
			}else if(selectNo.equals("6")) {
				 dao.deleteAccount();
			}else if(selectNo.equals("7")) {
				dao.restore();
			}else if(selectNo.equals("8")) {
				run = false;      //종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}//while 닫기
		System.out.println("프로그램 종료!!");
	}
	
}











