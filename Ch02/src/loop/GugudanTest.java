package loop;

public class GugudanTest {
	public static void main(String[] args) {
		int i,j;
		
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= i; j++) {
				System.out.printf("%dX%d=%d\n",i,j,(i*j));
			}
			System.out.println("\n");
		}
	}
}
