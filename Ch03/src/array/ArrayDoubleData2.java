package array;

public class ArrayDoubleData2 {
	public static void main(String[] args) {
		//실수형 배열의 연산
		double[] data = new double[5];
		
		//입력
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		//3,4번 data를 초기화 하지않으면 자동으로 0.0으로 들어간다.
		
		for(double dt : data) {
			System.out.println(dt);
		}
	}
}
