package ch01;

public class byteShortType {
	public static void main(String[] args) {
		//정수 자료형
		//byte 범위 : -128 ~ 127  8비트 2^8
		byte bData = -128;
		System.out.println(bData);
		
		// byte vDada2 = 128; 범위 초과 오류
		
		//short 범위 : -32768 ~ 32767 16비트 2^18
		short sData = 32767;
		System.out.println(sData);
		
		//short sData = 32768; 범위 초과
		
	}
}
