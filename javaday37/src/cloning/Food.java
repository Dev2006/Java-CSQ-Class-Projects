package cloning;

public class Food implements Cloneable {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
