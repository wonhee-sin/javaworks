package constant;

import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		// 입력 작업
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
		System.out.print("이름이 뭐에요? ");
		String name = scan.nextLine(); // 이름 입력
		
		System.out.println("이름 : " + name);
		
		System.out.println("나이는 몇 살이세요? ");
		int age = scan.nextInt();
		
		System.out.println("나이 : " + age);
		
		scan.close();

	}

}
