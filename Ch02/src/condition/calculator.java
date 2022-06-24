package condition;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		int inputNum1 , inputNum2;
		double result = 0.0;
		char operator;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수의 사칙연산 계산 프로그램 입니다.\n\n");
		System.out.print("첫번째 숫자를 입력해 주세요.");
		inputNum1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요.");
		inputNum2 = scanner.nextInt();
		System.out.print("어떤 연산을 진행 하시겠습니까? (+, -, *, /)");
		operator =scanner.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = inputNum1 + inputNum2;
			break;
		
		case '-' :
			result = inputNum1 - inputNum2;
			break;
			
		case '*' :
			result = inputNum1 * inputNum2;
			break;
			
		case '/' :
			result = (double)inputNum1 / (double)inputNum2;
			break;
			
		default:
			System.out.println("연산자를 제대로 입력하세요.");
			break;
		}
		scanner.close();
		
		System.out.printf("%d %s %d = %.2f 입니다.",inputNum1, operator, inputNum2, result );
	}

}
