package banking_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
	private static ArrayList<Account> accountarraylist = new ArrayList<>();
	private static ArrayList<Account> accounttemplist = new ArrayList<>();
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;    //실행 변수
		
		while(run) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌조회 | 6.계좌삭제 | 7.계좌복구 | 8.종료");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();  //nextLine()이 자동 줄바꿈이 되어 사용안함
			if(selectNo.equals("1")) {
				createAccount();  //계좌 생성
			}else if(selectNo.equals("2")) {
				accountList();    //계좌 목록
			}else if(selectNo.equals("3")) {
				deposit();        //입금
			}else if(selectNo.equals("4")) {
				withdraw();       //출금
			}else if(selectNo.equals("5")) {
				 searchAccount();
			}else if(selectNo.equals("6")) {
				deleteAccount();
			}else if(selectNo.equals("7")) {
				restore();
			}else if(selectNo.equals("8")) {
				run = false;      //종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}//while 닫기
		System.out.println("프로그램 종료!!");
	}

	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if(findAccount(ano) != null || findTempAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력하세요");
			}else {
				System.out.print("계좌주: ");
				String owner = scanner.next();
				while(true) {
					System.out.print("초기입금액: ");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액은 100원 이상입니다. 다시 입력하세요");
					}else {
						//계좌 객체 생성
						Account newAccount = new Account(ano, owner, balance);
								accountarraylist.add(newAccount); //계좌를 배열에 저장
								System.out.println("결과: 계좌가 생성되었습니다.");
								break;
					}
				}
				break;
			}
		} 
	}

	private static void accountList() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------------------------------");
		
		for(int i=0; i<accountarraylist.size(); i++) {
			Account account = accountarraylist.get(i);  //배열에 저장된 account를 반환
			if(account != null) {
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
			}
		}
	}

	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: (뒤로가려면 0키 입력)");
			String ano = scanner.next();
			//계좌가 없습니다. 다시 입력하세요
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) { //검색 계좌가 없으면
		    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
		    }else {
			    Account account = findAccount(ano);  //검색된 계좌 반환
				while(true) {
					System.out.print("입금액: ");
					int money = scanner.nextInt();
					if(money < 0) {
						System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
					}else {
						account.setBalance(account.getBalance() + money);
						System.out.printf("%,d원 정상 입금되었습니다.\n", money);
						break;
					}
				}//안쪽 while 닫기
				break;
		    }
		}//바깥 while 닫기
		}
	}

	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				Account account = findAccount(ano); //검색한 계좌번호의 account 반환
				while(true) {
					System.out.print("출금액: ");
					int money = scanner.nextInt();
					if(account.getBalance() == 0) {
						System.out.println("잔액이 없습니다. 초기화면으로 돌아갑니다.");
						break;
					}else if(money > account.getBalance()) {
						System.out.println("잔액이 부족합니다. 다시 입력하세요");
					}else if(money < 0) {
						System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
					}else {
						account.setBalance(account.getBalance() - money);  
						System.out.printf("%,d원 정상 출금되었습니다.\n", money);
						break;
					}
				}//안쪽 while
				break;
			}
		}//바깥쪽 while
	}
	
	private static void searchAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌조회");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: (뒤로가기 '0' 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				Account account = findAccount(ano);
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
				break;
			}
		}
		}
		
		
	}
	
	private static void deleteAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌삭제");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: (뒤로가기 '0' 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				Account account = accountarraylist.get(findIndex(ano));
				accounttemplist.add(account);
				accountarraylist.remove(findAccount(ano));
				break;
			}
		}
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountarraylist.size(); i++) {
				String dbAno = accountarraylist.get(i).getAno(); //저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {   //이미 저장된 계좌와 새로 입력한 계좌가 일치한다면
					account = accountarraylist.get(i);
					break;
				}
		}
		return account;
	}
	
	private static Account findTempAccount(String ano) {
		Account account = null;
		for(int i=0; i<accounttemplist.size(); i++) {
			String dbAno = accounttemplist.get(i).getAno(); //저장된 계좌를 가져와서
			if(dbAno.equals(ano)) {   //이미 저장된 계좌와 새로 입력한 계좌가 일치한다면
				account = accounttemplist.get(i);
				break;
			}
		}
		return account;
	}
	
	private static int findIndex(String ano) {
		int index = 0;
		for(int i=0; i<accountarraylist.size(); i++) {
				String dbAno = accountarraylist.get(i).getAno(); //저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {   //이미 저장된 계좌와 새로 입력한 계좌가 일치한다면
					index = i;
					break;
				}
		}
		return index;
	}
	
	private static void restore() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌복구");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.println("복구할 계좌의 번호를 입력하세요. : (뒤로가기 : '0'키 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
				if(findTempAccount(ano) == null) { //검색 계좌가 없으면
			    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
			    }else {
				    Account account = findTempAccount(ano);  //검색된 계좌 반환
				    accountarraylist.add(account);
				    accounttemplist.remove(findTempAccount(ano));
					break;
			    }
				
			}
		}
	}
	
}











