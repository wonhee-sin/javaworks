package outputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("여러 개의 문자를 입력하고 [Enter]를 누르세요");
		
		int readByte; //문자의 코드값
		
		try {
			while((readByte = System.in.read()) != -1) {
				//-1은 읽을 문자가 없다.
				System.out.print((char)readByte);
			}//while문 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}//catch문 닫기
		

	}//메인 메서드 닫기

}//클래스 닫기
