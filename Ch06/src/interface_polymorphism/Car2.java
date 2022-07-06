package interface_polymorphism;

public class Car2 {
	//필드
	Tire[] tires = {
		new  HanTire(),		
		new  HanTire(),		
		new  HanTire(),		
		new  HanTire()
	};	


			
	
	//메서드
	void run() {
		for (int i = 0; i < tires.length; i++) {
			tires[i].roll();
		}
	}
}
