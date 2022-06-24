package loop;

public class ForStar {
	public static void main(String[] args) {
		int i,j;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; i-j > 0; j++) {
				System.out.print(" ");
			}
			for(j = 0; j+i < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
