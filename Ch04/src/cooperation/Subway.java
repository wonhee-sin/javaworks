package cooperation;

public class Subway {
	//필드
	String lineNumber;
	int passenger;
	int money;
	
	//생성자
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger ++;
	}
	
	public void showInfo() {
		System.out.printf("지하철은 %s이고 승객은 %d명이며 수입은 %d원 입니다.\n",lineNumber, passenger, money);
	}
}
