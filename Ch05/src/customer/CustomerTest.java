package customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("Lee sunshin");

		//고객정보 출력
		System.out.println(customerLee.showCostomerInfo());
		
			//상품 구매
		int price = 10000;
		customerLee.calcPrice(price);
		System.out.println(customerLee.showCostomerInfo());
		
		int price2 = 20000;
		customerLee.calcPrice(price2);
		System.out.println(customerLee.showCostomerInfo());
	}
	

	

}
