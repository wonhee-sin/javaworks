package override;

public class SuperSonicAirPlane extends AirPlane {
	public static final int NORMAL = 0;
	public static final int SUPERSONIC = 1;
	
	int flyMode = NORMAL; //0 - 일반 비행 모드, 1 - 초음속 모드
	
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println(" -- 초음속 비행입니다. --");
		} else {
			super.fly();
		}
	}
}
