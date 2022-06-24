package loop;

import java.util.Scanner;

public class CoffeMachin {
	public static void main(String[] args) {
		int coffe = 5;
		int pay;
		int change;
		Scanner payMoney = new Scanner(System.in);
		while (true) {
			
			if (coffe > 0) {
				
			System.out.print("돈을 넣어주세요");
			pay = payMoney.nextInt();
			
		
				if (pay == 500) {
					System.out.println("커피가 나옵니다.");
					coffe--;
					System.out.printf("남은 커피의 양은 %d개 입니다\n",coffe);
				} else if (pay > 500) {
					change = pay - 500 ;
					System.out.printf("거스름돈 %d원을 돌려주고 커피가 나옵니다.\n",change);
					coffe--;
					change = 0;
					System.out.printf("남은 커피의 양은 %d개 입니다\n",coffe);
				} else if (pay < 500) {
					System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
					System.out.printf("남은 커피의 양은 %d개 입니다\n",coffe);
				}
		} else if (coffe == 0) {
			System.out.println("남은 커피가 없습니다.");
			break;
		}
			payMoney.close();
	}
}
}
