package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer lee = new Customer(10010, "sunshin");
//		VIPcustomer king = new VIPcustomer(10028, "sejong", 1449);
		//부모 클래스로 객체 생성 - 자동 타입 변환(형변환)
		Customer king = new VIPcustomer(10028, "sejong", 1449);
		
		//삼품 구매
		int price = 10000;
		lee.calcPrice(price);
		king.calcPrice(price);
		
		
		System.out.println(lee.showCostomerInfo());
		System.out.println(king.showCostomerInfo());
		
	}

}
