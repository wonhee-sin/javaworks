package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기 - 복사하기
		String originfile = "c:/file/bg0.jpg";
		String copyfile = "c:/file/bg1.jpg";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(originfile);
			fos = new FileOutputStream(copyfile);
			int i;
			while((i=fis.read()) != -1) { //이미지 읽기
				fos.write(i);	//이미지 쓰기
			}//while문 닫기
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//catch문 닫기
			
		}//finally닫기
	}//메인 메서드 닫기
}//클래스 닫기
