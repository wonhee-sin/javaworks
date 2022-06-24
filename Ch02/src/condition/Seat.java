package condition;

import java.util.Scanner;

public class Seat {
	public static void main(String[] args) {
		int aud, seatCol, line;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입장객 수 입력");
		aud = scanner.nextInt();
		System.out.println("좌석 열의 수 입력");
		seatCol = scanner.nextInt();
		
		if (aud % seatCol == 0) {
			line = aud / seatCol ;
			System.out.printf("%d개의 줄이 필요합니다.\n",line);
		} else {
			line = (aud /seatCol) +1 ;
			System.out.printf("%d개의 줄이 필요합니다\n",line);
		}
		
		scanner.close();
			}
}
