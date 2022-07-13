package string;

public class StringSubString {
	public static void main(String[] args) {
		String ssn = "990123-2345678";
		
		String firstnum = ssn.substring(0, 6);
		System.out.println(firstnum);
		
		String secondnum = ssn.substring(7);
		System.out.println(secondnum);
	}
}
