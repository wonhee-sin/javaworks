package object;

public class EqualsTest {

	public static void main(String[] args) {
		String color1 = new String("빨강");
		String color2 = new String("빨강");
		
		System.out.println(color1 == color2);			//false
		System.out.println(color1.equals(color2));	//true
		
		
		Book book1 = new Book(12, "Ant");
		Book book2 = new Book(12, "Ant");
		
		System.out.println(book1 == book2);			//false
		System.out.println(book1.equals(book2));	//false
		
		System.out.println();
		
		//hashcode() 테스트
		System.out.println(color1.hashCode());
		System.out.println(color2.hashCode());
		
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		
		
		
		
		
		
	}

}
