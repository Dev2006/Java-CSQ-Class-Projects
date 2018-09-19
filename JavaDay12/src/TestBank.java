import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println("Enter name");
		String tempName = reader.next();
		
		System.out.println("\n" + "Enter email");
		String tempEmail = reader.next();
		
		System.out.println("\n" + "Enter mobile");
		String tempMobile = reader.next();
		
		System.out.println("\n" + "Enter starting amount ($)");
		int tempBalance = reader.nextInt();
		
		if(tempBalance >= 500) {
			
			b.addUser(tempName, tempEmail, tempMobile, tempBalance);
		} else {
			
			System.out.println("\n" + "Starting amount is insufficient \n"
					+ "add " + (500-tempBalance) + " to make the starting amount valid");
			System.exit(0);
		}
		
		System.out.println("\n" + "What amount do you want to deposit?");
		b.deposit(reader.nextInt());
		
		System.out.println("\n" + "What amount do you want to withdraw");
		b.withdraw(reader.nextInt());
		
		System.out.println("\n" + "your current balance");
		b.checkBalance();
	}

}
