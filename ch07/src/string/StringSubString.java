package string;

public class StringSubString {

	public static void main(String[] args) {
		// subString(begin, end) : begin부터 end-1까지 문자 추출
		// subString(begin) : begin부터 끝까지 문자 추출
		String ssn = "991125-2345678";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println("주민등록번호 앞: " + firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println("주민등록번호 뒤: " + secondNum);
	}

}
