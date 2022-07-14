package chap04;

public class Test4_2 {

	public static void main(String[] args) {
		//1. for, while, do-while
		
		//2. 
		int sumV = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sumV += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sumV);
		System.out.println("===================");
		
		//3.
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if(dice1 + dice2 == 5)
				break;
		}
		System.out.println("===================");
		
		//4.
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		System.out.println();
		
		//5.
		int i, j;
		//방법1
		for(i=1; i<=4; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//방법2
		for(i = 1; i <= 4; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
				if(i == j)
					System.out.println();
			}
		}
		
		//6
		//방법1
		for(i=1; i<=4; i++) {
			for(j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법2
		for(i = 1; i <= 4; i++) {
			for(j = 4; j > 0; j--) {
				if(i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		/*
		i=1, j=1,2,3,4       * 
		i=2, j=1,2,3,4      **  
		i=3, j=1,2,3,4     ***
		i=4, j=1,2,3,4    ****
		 */
	}

}
