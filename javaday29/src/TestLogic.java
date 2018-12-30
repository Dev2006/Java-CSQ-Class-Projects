import java.util.Scanner;

interface Menu {
	
	public void printMenu();
}

public class TestLogic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1, 2, or 3 for menu");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			Menu punjabi = new Menu() {

				@Override
				public void printMenu() {
					
					System.out.println("Punjabi cuisine...");
					System.out.println("Pindi Chhole");
					System.out.println("Dal makhani");
				}
			};
			punjabi.printMenu();
			break;
		case 2:
			Menu chinese = new Menu() {

				@Override
				public void printMenu() {
					
					System.out.println("Chinese cuisine...");
					System.out.println("Manchurian");
					System.out.println("Hakka noodles");
				}
			};
			chinese.printMenu();
			break;
		case 3:
			Menu italian = new Menu() {

				@Override
				public void printMenu() {
					
					System.out.println("Italian cuisine...");
					System.out.println("Pizza");
					System.out.println("Pasta");
				}
			};
			italian.printMenu();
			break;
		default:
			System.out.println("Error, invalid choice");
			break;
		}
	}
}
