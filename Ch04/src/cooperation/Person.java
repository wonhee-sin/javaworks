package cooperation;

public class Person {
	//필드
	String name;
	int money;
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타다 메서드
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	//지하철을 타다 메서드
	public void takeSubway(Subway subway) {
		subway.take(2200);
		this.money -= 2200;
	}
	
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %d 입니다.\n",name,money);
	}
}
