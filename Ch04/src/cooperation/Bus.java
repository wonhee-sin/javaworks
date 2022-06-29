package cooperation;

public class Bus {
	//필드, 멤버
	int busNumber;	//버스 번호
	int passenger;	//승객
	int money;		//수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//태우다
	public void take(int money) {
		this.money += money; //요금을 받고
		passenger++;		//승객수가 증가
	}
	
	//버스의 정보
	public void showInfo() {
		System.out.printf("%d번 버스의 수입은 %d 이고 승객 수는 %d 이다.\n",busNumber, money, passenger);
	}
}
