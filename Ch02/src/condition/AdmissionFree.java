package condition;

import java.util.Scanner;

public class AdmissionFree {
	
	public static void main(String[] args) {
		
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		age = scanner.nextInt();
		
		if (age < 8 && age >= 0) {
			System.out.println("취학전 아동 입장료 1000원 입니다.");
		}else if (age >=8 && age < 14) {
			System.out.println("초등학생 입장료 2000원 입니다.");
		}else if (age >=14 && age < 20) {
			System.out.println("중 고등학생 입장료 2500원 입니다.");
		}else if(age < 0){
			System.out.println("나이를 제대로 입력하세요");
		}else {
			System.out.println("성인 입장료 3000원 입니다.");
		}
		scanner.close();
	}
	
}
