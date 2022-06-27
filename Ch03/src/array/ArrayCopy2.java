package array;

public class ArrayCopy2 {
	public static void main(String[] args) {
		//arraycopu()함수 사용
		int[] a = {1,2,3,4};
		int[] a2 = new int[4];
		int[] a3 = new int[4];
		
		//new로 생성하지 않고 직접 클래스이름으로 접근
		//arraycopy(대상배열, 대상의 인덱스, 복사할 배열, 복사할 배열인덱스, 배열의 길이);
		System.arraycopy(a, 0, a2, 0, 4);
		
		for(int aa : a2) {
			System.out.println(aa);
		}
		System.out.println("=================================");
		// clone() - Object클래스의 메서드
		a3 = a2.clone();
		
		for (int aaa : a3) {
			System.out.println(aaa);
		}
	}
}
