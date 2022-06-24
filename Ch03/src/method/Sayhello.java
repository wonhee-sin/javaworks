package method;

import java.util.Scanner;

public class Sayhello {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		sayHello();
		
		while(true) { 
		System.out.println("input your name!");
		name = sc.nextLine();
		if (name.equals("0"))
			break;
		sayHello2(name);
		}
	}
	
	public static void sayHello() {
		System.out.println("hello~");
	}
	
	public static void sayHello2(String name) {
		System.out.println("hello~ " + name);
	}
}
