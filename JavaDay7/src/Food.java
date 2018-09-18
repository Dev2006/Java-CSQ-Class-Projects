
public class Food {
	float price;
	String food_type;
	String food_name;
	
	public Food(String ft, String fn, float p) {
		food_name = fn;
		food_type = ft;
		
		price = p;
	}
	
	public Food() {
		food_name = "Bannana";
		food_type = "veg";
		
		price = 30;
	}
	
	public void displayRecords() {
		System.out.println("Food name: " + food_name + "  " + "Food type: " + food_type + "  " + "Price: " + price);
	}
}
