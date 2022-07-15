package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample2 {
	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기 - 복사하기
		String originfile = "c:/file/bg0.jpg";
		String copyfile = "c:/file/bg3.jpg";
		
		try(
				FileInputStream fis = new FileInputStream(originfile);
				FileOutputStream fos = new FileOutputStream(copyfile);
				){
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}//while문 닫기
		}catch(IOException e) {
			e.printStackTrace();
		}//catch문 닫기
	}//메인 메서드 닫기
}//클래스 닫기
