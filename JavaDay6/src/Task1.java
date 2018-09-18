import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Shoe shoes1 = new Shoe(10, "Casual", 5);
		shoes1.display();
		
		/*********************************************************************************/
		
		System.out.println("What size shoes do you want?");
		int size = reader.nextInt();
		
		System.out.println("What type of shoes do you want?");
		String type = reader.next();
		
		System.out.println("How many pairs of shoes do you want");
		int quantity = reader.nextInt();
		
		System.out.println("\n");
		
		
		Shoe shoes2 = new Shoe(size, type, quantity);
		shoes2.display();
		
		/*********************************************************************************/
		
		Shoe shoes3 = new Shoe();
		shoes3.display();
	}

}
