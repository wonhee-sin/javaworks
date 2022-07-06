package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			//data.txt의 내용을 읽어서 출력하기
			int i;
			while((i=fis.read()) !=-1) {
				System.out.println((char)i);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
