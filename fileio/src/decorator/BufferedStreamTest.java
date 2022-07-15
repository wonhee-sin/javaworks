package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		
		String originfile = "c:/file/bg0.jpg";
		String copyfile = "c:/file/bg5.jpg";

		
		try(FileInputStream fis = new FileInputStream(originfile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(copyfile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
