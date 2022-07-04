package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.복숭아 | 3.바나나 ");
		System.out.print("선택> ");
		
		try {
				int selectNo = Integer.parseInt(scan.nextLine());
				
				Fruit fruit = null;
			
				if (selectNo == 1) {
					fruit = new Grape();
				} else if (selectNo == 2) {
					fruit = new Peach();
				} else if (selectNo == 3) {
					fruit = new Banana();
				} else {
					System.out.println("지원하지 않는 기능입니다.");
				}
				fruit.showInfo();
				scan.close();
		} catch(Exception e) {
			System.out.println("올바른 문자를 입력하세요");
		}
	}

}
