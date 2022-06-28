package thisExample;

class Birthday {
	int year;
	int month;
	int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}



public class ThisTest {

	public static void main(String[] args) {
		
		Birthday bday = new Birthday();
		bday.setYear(2022);
		
		System.out.println(bday); //패키지이름.클래스이름@주소
		bday.printThis();

	}

}
