package tire;

public class HankookTire extends Tire {

	public HankookTire() {
		maxdurability = 5;
		durability = 0;
	}
	
	@Override
	public void roll() {
		durability++;
	}

	@Override
	public void showStatus() {
		System.out.println("한국 타이어 타이어의 현재 내구도 : " + durability);
	}
	
}
