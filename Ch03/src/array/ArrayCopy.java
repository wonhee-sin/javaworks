package array;

public class ArrayCopy {
	public static void main(String[] args) {
		// 배열 복사
		int[] array1 = {10,20,30,40};
		int[] array2 = new int[4];
		
		//저장
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//문자열 배열 복사
		char[] arr1 = {'n', 'e', 't'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3]; //역순 복사
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		//arr1을 arr3으로 역순 복사
		for (int i = 0; i < arr1.length; i++) {
			arr3[2-i] = arr1[i];
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
	}
	}
}
