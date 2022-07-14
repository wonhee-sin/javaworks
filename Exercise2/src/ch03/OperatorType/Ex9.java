package ch03.OperatorType;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input number1");
		String snum1 = scan.nextLine();
		System.out.println("input number2");
		String snum2 = scan.nextLine();
		
		double num1 = Double.parseDouble(snum1);
		double num2 = Double.parseDouble(snum2);
		
		if(num2 == 0.0) {
			System.out.println("결과 : 무한대");
		} else {
			double result = num1 / num2;
			System.out.println("결과 : " + result);
		}
		
	}
}
