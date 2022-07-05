package interfaceex.remotecontrol;

public class Audio implements RemoteControl {
	//필드
	private int vol;
	
	//생성자
	public Audio () {
		System.out.println("====== Audio construct ======");
	}
	
	@Override
	public void turnOn() {
		System.out.println("=== Audio ON ===");
		
	}

	@Override
	public void turnOff() {
		System.out.println("=== Audio OFF ===");
		
	}

	@Override
	public void setVolumn(int vol) {
		if (vol > MAX_VOL) {
			this.vol = 10;
		} else if (vol < MIN_VOL) {
			this.vol = 0;
		} else {
			this.vol = vol;
		}
		System.out.println("Volumn : " + this.vol);
	}
	
}
