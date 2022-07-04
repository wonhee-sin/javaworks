package takeTrnas;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//차량에 탑승
	public void take(vehicle vehivle, int fee) {
		vehivle.carry(fee);
		this.money -= fee;
	}
	
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %,d원입니다.\n", name, money );
	}
}
