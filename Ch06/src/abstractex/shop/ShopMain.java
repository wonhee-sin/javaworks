package abstractex.shop;

public class ShopMain {

	public static void main(String[] args) {
		
		HeadShop univShop = new Shop1();
		univShop.sellBibimBop();
		univShop.sellDoenjangJjigae();
		univShop.sellkimchiJjigae();
		
		System.out.println("==================");
		
		HeadShop stationShop = new Shop2();
		stationShop.sellBibimBop();
		stationShop.sellDoenjangJjigae();
		stationShop.sellkimchiJjigae();
		
		System.out.println("==================");
	}

}
