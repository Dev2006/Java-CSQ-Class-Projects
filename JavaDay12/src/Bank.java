
public class Bank {
	private String name;
	private String email;
	private String mobile;
	private int balance;
	
	
	public void addUser(String name, String email, String mobile, int balance) {
		
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		
		this.balance += amount;
		System.out.println("An amount of " + amount + " has been deposited from your account \n");
	}
	
	public void withdraw(int amount) {
		
		if(amount <= this.balance) {
			
			this.balance -= amount;
			System.out.println("An amount of " + amount + " has been withdrawn from your account \n");
		} else {
			
			System.out.println("Insuffecient account balance \n");
		}
	}
	
	public void checkBalance() {
		
		System.out.println("Your account balance is " + this.balance);
	}
	
	
	
}
