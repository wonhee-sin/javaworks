package operator;

public class swap {

	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.printf("교환 전\nx = %d, y = %d\n", x, y);
		System.out.println("--------------------------------");
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.printf("교환 후\nx = %d, y = %d\n", x, y);
		
	}

}
