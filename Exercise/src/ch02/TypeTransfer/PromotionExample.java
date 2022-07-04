package ch02.TypeTransfer;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		
		byte bv = 10;
		int iv = bv;
		System.out.println("iv : " + iv);
		
		char cv = '가';
		iv = cv;
		System.out.println("iv : "+ iv);
		
		iv = 50;
		long lv = iv;
		System.out.println("lv : " + lv);
		
		lv = 100;
		float fv = lv;
		System.out.println("fv : " + fv);
		
		fv = 100.5F;
		double dv = fv;
		System.out.println("dv : " + dv);

	}

}
