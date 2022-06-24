package loop;

import java.util.Scanner;

public class Seats {
	public static void main(String[] args) {
		int member, seatCol, seatRow;
		Scanner sc = new Scanner(System.in);
		System.out.print("입장객 수 입력: ");
		member = sc.nextInt();
		System.out.println("좌석 열의 수: ");
		seatCol =sc.nextInt();
		
		if (member % seatCol == 0) {
			seatRow = member / seatCol;
		}else {
			seatRow = (member / seatCol) + 1;
		}
		
		
			for (int i = 0; i < seatRow; i++) {
				for (int j = 1; j <= seatCol; j++) {
					if (((i*seatCol)+j) > member)
						break;
					System.out.print("좌석"+ ((i*seatCol)+j) +" " );
				}
				System.out.println();
			}
	}
}
