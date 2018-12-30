package exceptionHandling;

import javax.swing.JOptionPane;

public class TestBankUser {
	
	public static void main(String[] args) {
		BankUser bu = new BankUser("Dev", 2000);
		while (true) {
			int ch = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to deposit" + '\n' + 
					"Press 2 to withdraw" + '\n' +
					"Press 3 to show current money"));
			
			double amount;
			
			switch (ch) {
			case 1:
				amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount"));
				bu.deposit(amount);
				
				break;
			case 2:
				try {
					amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount"));
					bu.withdraw(amount);
				} catch(InsuffecientFundsException e) {
					e.printStackTrace();
				}
				
				break;
			case 3:
				bu.printMoney();
			default:
				break;
			}
		}
	}
}
