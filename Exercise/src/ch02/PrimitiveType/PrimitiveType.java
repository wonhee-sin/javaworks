package ch02.PrimitiveType;

public class PrimitiveType {

	public static void main(String[] args) {
		//자바의 기본 타입
		//정수 타입 - byte, char, short, int, long
		//실수 타입 - float, double
		//논리 타입 - boolean
		
		//정수 타입
		//자바에서 정수 타입은 총 5개로 다음과 같이 메모리 사용 크기와 저장되는 값의 범위가 서로 다르다.
		//byte	1byte	8bit	(-128 ~ 127)
		//short	2byte	16bit	(-32,768 ~ 32,767)
		//char	2byte	16bit	(0 ~ 65535{유니코드})
		//int	4byte	32bit	(약 -21억 ~ 21억)
		//long	8byte	64bit	( ... {매우 크다})
		
		//char타입은 음수를 가질 수 없다.
		
		//byte 타입 변수
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;		//컴파일 에러 ( byte의 저장되는 값의 범위를 벗어남 )
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		//기본적으로 컴파일러는 정수 리터럴을 int타입으로 간주한다 그래서 정수 리터럴이 int타입의 허용 범위를 초과할 경우,
		//long 타입임을 컴퓨터에게 알려줘야 하는데 숫자 뒤에 L을 붙이면 된다(소문자 l은 1과 비슷하므로 사용하지 않는다)
		//정수 리터럴이 int허용 범위 안이라면 L을 굳이 붙이지 않아도 된다.
		
		long v1 = 10;
		long v2 = 20L;
		//long v3 = 10000000000; //컴파일 에러 long으로 선언했으나 리터럴을 int타입으로 간주하여 int범위를 벗어나 에러가 뜬다.
		long v4 = 10000000000L;
		//int v5 = 10000000000L; //int에 L을 적는다고해서 사용 가능해 지지는 않음
	}

}
