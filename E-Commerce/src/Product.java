public class Product {
	private String productName;
	private int retailPrice;
	private int discountedPrice;
	private String brand;
	
	public Product(String productName, int retailPrice, int discountedPrice, String brand) {
		this.productName = productName;
		this.retailPrice = retailPrice;
		this.discountedPrice = discountedPrice;
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return "Name           	: " + productName + '\n' +
				"Retail Price   	: " + retailPrice + '\n' +
				"Discount Price 	: " + discountedPrice + '\n' +
				"~~ You Save = " + (retailPrice - discountedPrice) + '\n' +
				"Brand          	: " + brand;
	}

	
}
