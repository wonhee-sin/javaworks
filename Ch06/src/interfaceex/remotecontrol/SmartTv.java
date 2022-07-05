package interfaceex.remotecontrol;

public class SmartTv implements RemoteControl, Searchable {
	private int vol;
	
	public SmartTv () {
		System.out.println(" ======= Smart Tv Construct ======= ");
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("=== TV ON ===");
		
	}

	@Override
	public void turnOff() {
		System.out.println("=== TV OFF ===");
		
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
