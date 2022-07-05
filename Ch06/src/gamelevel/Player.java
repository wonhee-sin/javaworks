package gamelevel;

public class Player {
	//playerLevel 클래스 참조
	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level =level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
