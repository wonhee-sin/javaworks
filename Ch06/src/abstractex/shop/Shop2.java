package abstractex.shop;

public class Shop2 extends HeadShop {
	public Shop2 () {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void sellDoenjangJjigae() {
		System.out.println("된장찌개 :6,000원");
		
	}

	@Override
	public void sellkimchiJjigae() {
		System.out.println("김치찌개 : 6,500원");
		
	}

	@Override
	public void sellBibimBop() {
		System.out.println("비빔밥 : 7,000원");
		
	}
	
	
}
