package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {
	
	public static void main(String[] args) throws IOException {
		//OutputStream, fileOutputStream 클래스 사용
	
			OutputStream os = new FileOutputStream("c:/file/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.close();
	}//메인 메서드 닫기
	
}//클래스 닫기
