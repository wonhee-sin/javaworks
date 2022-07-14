package chap08;

public class Test8_1 {

	public static void main(String[] args) {
		//1. O, X, O, O
		
		//2. O, O, X, O
		
		//3. 
		printSound(new Cat());
		printSound(new Dog());
		
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
