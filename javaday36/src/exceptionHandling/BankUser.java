package exceptionHandling;

public class BankUser {
	String name;
	double money;
	
	public BankUser(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public void deposit(double amount) {
		this.money += amount;
	}
	
	public void withdraw(double amount) throws InsuffecientFundsException {
		if (amount > this.money) {
			throw new InsuffecientFundsException("The amount of " + amount + "cannot be withdrawn." + '\n'
					+ "You lack " + (amount - this.money));
		} else {
			this.money -= amount;
		}
	}
	
	public void printMoney() {
		System.out.println("Current amount = " + this.money);
	}
}
