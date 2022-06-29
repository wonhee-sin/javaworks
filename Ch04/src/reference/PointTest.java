package reference;

import java.util.Scanner;

public class PointTest {

	public static void main(String[] args) {
		int n1 = 0; 
		int n2 = 0;
		Point point1 = new Point(2, 3);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n1 입력");
		n1 = scan.nextInt();
		System.out.print("n2 입력");
		n2 = scan.nextInt();
		Point point2 = new Point(n1, n2);
		point1.showInfo();
		point2.showInfo();

	}

}
