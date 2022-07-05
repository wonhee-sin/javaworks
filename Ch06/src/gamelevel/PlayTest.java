package gamelevel;

public class PlayTest {

	public static void main(String[] args) {
		Player player = new Player();
	
		player.play(1);
		
		System.out.println();
		
		player.upgradeLevel(new AdvancedLevel());
		player.play(2);
		
		System.out.println();
		
		player.upgradeLevel(new SuperLevel());
		player.play(3);

	}

}
