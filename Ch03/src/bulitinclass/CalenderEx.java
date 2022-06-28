package bulitinclass;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		//시간
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d %d %d\n",year, month, date);
		System.out.printf("%d %d %d\n",hour, minute, second);
		System.out.println(day);
	}
}
