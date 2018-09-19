import java.util.Scanner;

public class TestMenu {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Menu csn = null;
		
		System.out.println("Welcome to our Order Taking software!");
		System.out.println("Please choose a cuisine: \n"
				+ "Press 0 for Italian\n"
				+ "Press 1 for Mexican\n"
				+ "Press 2 for Indian\n");
		int tempChoice = reader.nextInt();
		if(tempChoice == 0) {
			
			csn = new ItalianMenu();
		} else if(tempChoice == 1) {
			
			csn = new MexicanMenu();
		} else if(tempChoice == 2) {
			
			csn = new IndianMenu();
		} else {
			
			csn = new Menu();
			System.out.println("The choice wasn't understood");
			System.exit(0);
		}
		
		for(;;) {
			System.out.println("Press 0 to order" + "\n" + "Press 1 to proceed to checkout");
			tempChoice = reader.nextInt();
			
			if(tempChoice == 0) {
				
				csn.printMenu();
				int tempOrder = reader.nextInt();
				csn.placeOrder(tempOrder);
			} else if(tempChoice == 1) {
				
				csn.printBill();
				break;
			}
		}
		
		reader.close();
	}
}