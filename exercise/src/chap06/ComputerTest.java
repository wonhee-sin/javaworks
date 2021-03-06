package chap06;

class Computer{
	//가변 매개변수 - 매개변수가 정해지지 않은 경우 합계 
	int sum1(int[] values) {
		int sum= 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//... -> 배열
	int sum2(int ... values) { 
		int sum= 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerTest {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4);
		System.out.println("result4: " + result4);
	}

}
