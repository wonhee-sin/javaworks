package condition;

public class medalColor {
	public static void main(String[] args) {
		String medalColor = "Gold";
		
		switch(medalColor) {
		
		case "Gold" :
			System.out.println("금메달 입니다.");
			break;
		case "Silver" :
			System.out.println("은메달 입니다.");
			break;
		case "Bronze" :
			System.out.println("동메달 입니다.");
			break;
		default :
			System.out.println("노메달 입니다.");
			break;
		}
	}
}
