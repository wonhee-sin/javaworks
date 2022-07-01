package statment;

public class Alcohol extends Drink{
	//field
	float alper;

	public Alcohol(String name, int price, int count, float alper) {
		super(name, price, count);
		this.alper = alper;
	}
	
	//스태틱 메서드에는 오버라이드를 적지 않는다.
	//재정의는 객체가 생성될때 작동하므로 스태틱은 객체 생성이 아님
	public static void printTitle() {
		System.out.println("상품평(도수[%])\t가격\t수량\t금액");
	}
	
	@Override
	public void printData() {
		System.out.println(name + "("+ alper + ")\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
}
