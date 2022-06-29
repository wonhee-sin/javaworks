package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Product[] product = new Product[3];
		
		product[0] = new Product("notebook",1000000);
		product[1] = new Product("notebook",1000000);
		product[2] = new Product("notebook",1000000);
		
		for (Product p : product) {
			System.out.println(p.showInfo());
		}
	}
}
