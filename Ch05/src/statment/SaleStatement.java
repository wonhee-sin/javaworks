package statment;

public class SaleStatement {
	public static void main(String[] args) {
		
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 1000, 4);
		Drink soju = new Alcohol("소주", 3000, 5, 15.4f);
		
		//드링크 전표
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		System.out.println();
		
		//알콜 전표
		Alcohol.printTitle();
		soju.printData();
		
		//전표 출력
		int sum = coffee.getTotalPrice() + tea.getTotalPrice() + soju.getTotalPrice();
		System.out.println("\n\n\n\t\t*** 합계 금액 " + sum + "원 ***");
	}
}
