package operator;

public class bitOperator {

	public static void main(String[] args) {
		// 비트 연산자
		int num1 = 5;  // (0000 0101)
		int num2 = 9;   // (0000 1001)	
		int result = num1 & num2; // 모두 1일때만 1
		int result2 = num1 | num2; //1개만 1이면 1
		System.out.println(result);
		System.out.println(result2);
		
		int num3 = 5;                    // (0000 0101)
		System.out.println(num3 << 1);  // (0000 1010)
		System.out.println(num3 << 2);  // (0001 0100)
		System.out.println(num3 << 3);  // (0001 0100)
		System.out.println(num3 >> 2);  // (0000 0001)
		
		//2진수, 16진수 표기
		int n = 10;
		int bNum = 0b1010;
		int hNum = 0xA;
		
		System.out.println(bNum);
		System.out.println(hNum);
	}

}
