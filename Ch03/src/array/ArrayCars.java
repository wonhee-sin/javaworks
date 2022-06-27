package array;

public class ArrayCars {

	public static void main(String[] args) {
		// 문자형 배열 선언과 사용.
		String[] cars = new String[4];
		
		//자료 입력
		cars[0] = "Morning";
		cars[1] = "sonata";
		cars[2] = "sportage";
		cars[3] = "k7";
		
		//String[] cars = {"Morning","sonata","sportage","k7"};
		
			//전체 조회
	for (int i = 0; i < cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	//수정 (sportage > BMW)
	
	cars[2] = "BMW";
	System.out.println("================================");
	for (int i = 0; i < cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	//향상된 for(객체방식)
	for(String car : cars) { //for(자료형 변수 : 배열이름)
		System.out.println(car + " ");
	}
	}
	
}
