package template_method;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("시동을 끕니다.");
		
	}

}
