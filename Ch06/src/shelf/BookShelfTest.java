package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 Java");
		shelfQueue.enQueue("스프링부트");
		
		//자료의 개수
		System.out.println("현재 리스트의 개수 " + shelfQueue.getSize());
		System.out.println(shelfQueue);
		System.out.println(shelfQueue.toString());
		
		
//		BookShelf bs = (BookShelf)shelfQueue;
//		System.out.println(bs.getShelf());
//		System.out.println(bs.shelf.toString());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	
	}

}
