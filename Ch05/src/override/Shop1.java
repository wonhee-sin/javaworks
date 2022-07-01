package override;

public class Shop1 extends HeadShop {
	
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	//메서드 재정의 - 부모클래스의 내용이나 기능이 다를때 재정의
	//매너테이션 - '@' 컴파일러에게 신호를 보냄
	@Override
	public void sellDoenjangJjigae() {
		System.out.println("된장찌개: 6,000");
	}
	@Override
	public void sellKimchiJjigae() {
		System.out.println("김치찌개: 7,500");
	}
	@Override
	public void sellBibimbab() {
		System.out.println("비빔밥: 5,000");
	}
}
