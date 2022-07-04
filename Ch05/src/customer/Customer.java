package customer;

public class Customer {
	//필드
	private int customerID;
	private String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer() {
		System.out.println(" -- Customer() construct --");
		customerGrade = "silver";
		bonusRatio = 0.01;
	}
	
	//매개 변수를 가진 생성자
	public Customer(int customerID, String customerName) {
		System.out.println(" -- Customer() construct --");
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "silver";
		bonusRatio = 0.01;
	}
	
	//getter, setter 메서드
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getCustomerID () {
		return customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName () {
		return customerName;
	}
	
	//보너스 적립 계산
	public int calcPrice(int price) {
		//보너스 포인트 = 가격 x 보너스 적립율
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	public String showCostomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " 
							+ bonusPoint + "점 입니다.";
	}
}
