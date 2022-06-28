package bulitinclass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		//날짜 포맷
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
		
		//LocalDate
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		
		String formattedDate = localDateTime.format(myFormat);
		System.out.println(formattedDate);
	}
}
