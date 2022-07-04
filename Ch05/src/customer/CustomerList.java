package customer;

import java.util.ArrayList;

public class CustomerList {

	public static void main(String[] args) {
		//어레이리스트(ArrayList) 자료구조를 사용하기
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//실버 고객 2명, 골드 2명, VIP 1명 객체 생성
		Customer lee = new Customer(10010, "sunshin");
		Customer shin = new Customer(10021, "saimdang");
		Customer hong = new GoldCustomer(11040, "gildong");
		Customer youl = new GoldCustomer(11040, "gok");
		Customer king = new VIPcustomer(8804,"sejong", 1413);
		
		//자료 추가
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
		
		//계산
		System.out.println("=======할인율과 보너스 포인트 계산=======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님은 " + cost + "를 지불하셨습니다.");
		}
		
		//고객 정보
		System.out.println("=======고객 정보 출력=======");
		
		for(int i=0; i<customerList.size(); i++) {
			Customer customer = customerList.get(i);
			System.out.println(customer.showCostomerInfo());
		}
		

	}

}
