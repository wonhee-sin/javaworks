package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {
	public static void main(String[] args) throws IOException {
		//데이터가 test1.db인 바이트 기반 파일 입력 스트림 생ㅇ성
		InputStream is = new FileInputStream("c:/file/test1.db");
		
		//읽어오기
		int data;
		while((data = is.read()) != -1) {
			System.out.println(data);
		}//while문 닫기
		is.close();
	}//메인메서드 닫기
}//클래스닫기
