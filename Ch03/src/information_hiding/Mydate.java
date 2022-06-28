package information_hiding;

public class Mydate {
	//필드
	private int day;
	int month;
	int year;
	
	public void setYear (int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
				if (month == 2) {
			if (day < 1 || day > 28) {
				if (day == 29) {
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
						System.out.println("윤년 입니다.");
						this.day = day;
					}else {
						System.out.println("날짜 오류입니다.");
					}
				}else {
					System.out.println("날짜 오류입니다.");
				}
			}else {
			this.day = day;
			}
		}else {
			this.day = day;
		}
	}
	
	
	
	public int getYear () {
		return year;
	}
	
		public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
}
