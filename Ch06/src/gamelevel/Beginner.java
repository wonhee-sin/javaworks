package gamelevel;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run slowly");
		
	}

	@Override
	public void jump() {
		System.out.println("can't jump");
		
	}

	@Override
	public void turn() {
		System.out.println("can't turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******** it's beginner ********");
		
	}

}
