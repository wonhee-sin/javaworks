package reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileRederExample {
	public static void main(String[] args) {
		
		//문자파일 기반입력 스트림
		try(
				Reader fr = new FileReader("file1.txt")
				){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
