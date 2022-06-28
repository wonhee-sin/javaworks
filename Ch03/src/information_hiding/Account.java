package information_hiding;

public class Account {
	
	private String acn;
	private String owner;
	private int balance;
	
	Account() {}
	
	public Account(String acn, String owner, int balance) {
		this.acn = acn;
		this.owner = owner;
		this.balance = balance;
	}
	
	void setAcn(String acn) { //외부입력 매개변수와 필드의 이름을 같게한다. 필드쪽에 this 붙임
		this.acn = acn;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getAcn() {
		return acn;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
}

