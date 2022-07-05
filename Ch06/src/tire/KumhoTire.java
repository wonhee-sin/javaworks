package tire;

public class KumhoTire extends Tire {
	
	public KumhoTire() {
		maxdurability = 7;
		durability = 0;
	}
	
	@Override
	public void roll() {
		durability++;
		}
	
	@Override
	public void showStatus() {
		System.out.println("금호 타이어 타이어의 현재 내구도 : " + durability);
	}
	}


