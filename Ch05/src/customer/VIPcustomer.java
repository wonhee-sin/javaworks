package customer;

public class VIPcustomer extends Customer{
	//field
	private int agentID;	//상담원 ID
	private double saleRatio;	//구매 ㅏㄹ인율
	
	//생성자
	public VIPcustomer () {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPcustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	public int getAgentID() {
		return agentID;
	}
	
	//가격 계산 재정의
	@Override
	public int calcPrice(int price) {
		//가격 = 가격 - (가격 x 구매할인율)
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	@Override
	public String showCostomerInfo() {
		
		return super.showCostomerInfo() + "담당 상담원의 아이디는 " + agentID + "입니다.";
	}
	
	
}
