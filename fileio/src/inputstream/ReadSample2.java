package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample2 {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("c:/file/test2.db");
			
			byte[] buffer = new byte[100];
			
			int data;
			while((data = is.read(buffer)) != -1) {
				for(int i = 0; i < data; i++) {	//읽은 수 만을 출력
					System.out.println(buffer[i]);
				}//for문 닫기
			}//while 문 닫기
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		 try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//catch문 닫기
		}//finally문 닫기
	}//메인 메서드 닫기

}//클래스닫기
