package array;

public class Product {
	String products;
	int price;
	
	//생성자
	public Product(String products, int price) {
		this.products = products;
		this.price = price;
	}
	
	public String showInfo() {
		return products + "," + price;
	}
}
