package operator;

public class operator3 {
	public static void main(String[] args) {
		// 비교, 논리 연산자
		System.out.println(7 < 4);
		System.out.println(7 > 4);
		System.out.println(7 == 4);
		System.out.println(7 != 4);
		
		//논리 연산자
		System.out.println((7 > 4) && (7 < 4));
		System.out.println((7 > 4) || (7 < 4)); // 단락 회로 뒤에내용 상관없이 앞이 트루라 다 트루기때문에 뒤에가 필요없다 판단하여 데드코드라고 판단
		System.out.println(!(7 > 4)); //논리 부정
		System.out.println(!(7 < 4));
		System.out.println("===================================================");
		
		//단락 회로 예제
		int n = 10, i = 2;
		boolean x = ((n=n+10) < 10) && ((i = i + 2) < 10);
		System.out.println(x); //flase
		System.out.println(n);
		System.out.println(i); //2 앞에 내용이 이미 false라 컴파일러가 끝이나서 뒤에 값이 읽히지가 않음 > 연산이 안됐다.
		System.out.println("===================================================");
		
		boolean y = ((n=n+10) > 10) && ((i = i + 2) < 10);
		System.out.println(y);
		System.out.println(n);
		System.out.println(i);
	}
}
