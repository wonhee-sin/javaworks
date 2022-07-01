package override;

public class Shop2 extends HeadShop {
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	
	@Override
	public void sellDoenjangJjigae() {
		System.out.println("된장찌개: 7,000");
	}
	@Override
	public void sellKimchiJjigae() {
		System.out.println("김치찌개: 8,500");
	}
	@Override
	public void sellBibimbab() {
		System.out.println("비빔밥: 6,000");
	}
}
