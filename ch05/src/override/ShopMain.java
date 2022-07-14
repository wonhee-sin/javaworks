package override;

public class ShopMain {

	public static void main(String[] args) {
		//HeadShop 객체 생성
		/*HeadShop headshop = new HeadShop();
		System.out.println("본점 입니다.");
		headshop.sellDoenjangJJige();
		headshop.sellKimchiJJige();
		headshop.sellBibimBap();
		System.out.println("==================");*/
		
		//Shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		//HeadShop shop1 = new Shop1();
		
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();
		
		System.out.println("==================");
		Shop2 shop2 = new Shop2();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellKimchiJJige();
	}

}
