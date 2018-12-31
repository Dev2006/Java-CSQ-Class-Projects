import javax.swing.JOptionPane;

public class Driver {
	
	public static void main(String[] args) {
		Store s = new Store();
		
		while (true) {
			byte choice = Byte.parseByte(JOptionPane.showInputDialog("Enter 1 to list all products" + '\n' +
					"Enter 2 to see the details of a product" + '\n' +
					"Enter 3 to exit"));
			
			if (choice == 1) {
				s.list();
				System.out.println("\n\n");
			} else if (choice == 2) {
				int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter an product ID"));
				try {
					s.detail(ID);
				} catch (ProductNotFoundException e) {
					System.out.println(e);
				} finally {
					System.out.println("\n\n");
				}
			} else if (choice == 3) {
				System.exit(0);
			}
		}
	}
}
