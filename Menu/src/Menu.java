public class Menu {
	
	String[] foodItems = new String[20];
	String[] orderItems = new String[20];
	int orderSize = 0;
	
	public void printMenu() {
		
		System.out.println("\n" + "THE MENU\n" + "========\n");
		
		for(int i = 0; i < foodItems.length; i++) {
			
			if(!(foodItems[i] == null)) {
				
				System.out.println("Type " + i + " to order " + foodItems[i]);
			}
		}
		
		System.out.println("\n");
	}
	
	
	public void placeOrder(int i) {
		
		try {
			
			orderItems[orderSize] = foodItems[i];
			orderSize++;
			System.out.println(foodItems[i] + " has been added to your order");
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Error! The food item couldn't be found");
		}
		
		System.out.println("\n" + "\n" + "\n");
	}
	
	public void printBill() {
		//copy code from previous project
	}
}