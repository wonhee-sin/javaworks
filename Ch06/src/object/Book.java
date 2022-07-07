package object;

public class Book {
	//필드
	int bookNumber;		//책 번호
	String bookTitle;		//책 제목
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookNumber + "," + bookTitle ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book) obj;	
			if(this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return bookNumber;
	}
	
	
	
	
	
}
