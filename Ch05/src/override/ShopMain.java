package override;

public class ShopMain {
	public static void main(String[] args) {
		HeadShop headshop = new HeadShop();
		System.out.println("본점 입니다.");
		
		headshop.sellDoenjangJjigae();
		headshop.sellKimchiJjigae();
		headshop.sellBibimbab();
		
		System.out.println();
		
		//Shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDoenjangJjigae();
		shop1.sellKimchiJjigae();
		shop1.sellBibimbab();
		
		System.out.println();
		
		Shop2 shop2 = new Shop2();
		shop2.sellDoenjangJjigae();
		shop2.sellKimchiJjigae();
		shop2.sellBibimbab();
		
	}
}
