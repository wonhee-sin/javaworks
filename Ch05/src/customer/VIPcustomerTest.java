package customer;

public class VIPcustomerTest{

	public static void main(String[] args) {
		//고객 객체 생성
		VIPcustomer customerLee = new VIPcustomer();
		
		customerLee.setCustomerName("sejong");
		customerLee.setAgentID(1424);
		
		//상품 구매
		int price = 10000;
		customerLee.calcPrice(price);
		
		System.out.println(customerLee.showCostomerInfo());
		
		int price2 = 10000;
		customerLee.calcPrice(price2);
		
		System.out.println(customerLee.showCostomerInfo());

		
	}

}
