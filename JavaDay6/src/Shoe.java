
public class Shoe {
	int size;
	String type;
	int quantity;
	
	public Shoe() {
		size = 7;
		type = "Casual";
		quantity = 1;
	}
	
	public Shoe(int size_, String type_, int quantity_) {
		size = size_;
		type = type_;
		quantity = quantity_;
	}
	
	public void display() {
		System.out.println("Size: " + size);
		System.out.println("Type: " + type);
		System.out.println("quantity: " + quantity);
		System.out.println("======================");
	}
}
