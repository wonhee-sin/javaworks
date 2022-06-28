package information_hiding;

public class AccountTest {
	public static void main(String[] args) {
		//Account 객체 생성
		Account account = new Account();
		Account account2 = new Account("100-4567","다있소",1000);
		
		//필드에 직접 접근하기 
		account.setAcn("100-1234");
		account.setOwner("ekdlth");
		account.setBalance(1000);
		
		
		System.out.println(account.getAcn());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());
		
		System.out.println();
		
		System.out.println(account2.getAcn());
		System.out.println(account2.getOwner());
		System.out.println(account2.getBalance());
	}
}
