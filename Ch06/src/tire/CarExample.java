package tire;

import java.util.Scanner;

public class CarExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean work = true;
		Car myCar = new Car();
			
			while(work) {
				System.out.print("Drive? (y/n)");
				String answer1 = scan.nextLine();
				
				if(answer1.equals("y") || answer1.equals("Y")) {
					if (myCar.backLeftTire.durability == myCar.backLeftTire.maxdurability || 
							myCar.backRightTire.durability == myCar.backRightTire.maxdurability ||
							myCar.frontRightTire.durability == myCar.frontRightTire.maxdurability ||
							myCar.frontLeftTire.durability == myCar.frontLeftTire.maxdurability) {
						System.out.println("stop!");
						
						System.out.print("did you Chang your tire? (y/n)");
						String answer2 = scan.nextLine();
						
						if (answer2.equals("n") || answer2.equals("N")) {
							
							System.out.println("주행을 종료합니다.");
							work = false;
							
						} else if (answer2.equals("y") || answer2.equals("Y")) {
							
							System.out.print("where (1: forntleft 2:frontright 3:backleft 4:backright)");
							int answer4 = Integer.parseInt(scan.nextLine());
							System.out.print("what kind of (1: kumho 2:hankook)");
							int answer3 = Integer.parseInt(scan.nextLine());
							myCar.changeTire(answer4, answer3);		
						} else {
							System.out.println("잘못 입력 하셨습니다.");
							return ;
						}
						
					} else {
						myCar.run();
					}
					
				}else if (answer1.equals("n") || answer1.equals("N")) {
					System.out.println("주행을 종료합니다.");
					work = false;
				} else {
					System.out.println("잘못 입력 하셨습니다.");
					return ;
				}
			}
	}

}
