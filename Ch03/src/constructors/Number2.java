package constructors;

public class Number2 {
	
	int x;
	
	Number2(int y) {
		x = y;
		
	}
	public static void main(String[] args) {
		Number2 myNum = new Number2(2);
		System.out.println(myNum.x);
	}

}
