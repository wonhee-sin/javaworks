package inheritance;

 class Car {
	 //field
	 String brand;		//차량 모델
	 int cc;				//배기량
	 
	 //생성자
	 public Car(String brand, int cc) {
		 this.brand = brand;
		 this.cc = cc;
	 }
 }

public class Taxi  extends Car {
	//field
	int passenger;
	
	//부모 클래스가 매개변수가 있을때는 super()의 변수를 매개로 전달.
	public Taxi(String brand, int cc, int passenger) {
		super(brand, cc);
		this.passenger = passenger;
		
	}
}
