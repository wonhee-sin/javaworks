package object;

public class ToStringExample {

	public static void main(String[] args) {
		//toString() - 객체의 정보를 문자열로 출력하는 함수.
		//String 클래스의 name 객체
		String name = new String("sangsik");
		System.out.println(name);
		
		System.out.println(name.toString());
		
		Book book = new Book(12,"ant");
		System.out.println(book);
		System.out.println(book.toString());

	}

}
