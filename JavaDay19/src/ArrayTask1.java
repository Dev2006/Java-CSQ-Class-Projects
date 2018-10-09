import javax.swing.JOptionPane;

public class ArrayTask1 {
	
	public static void main(String[] args) {
		int[] a = {12, 28, 31, 13, 20};
		for(;;) {
			
			System.out.println("\n\n" + "CURRENT ARRAY");
			for (int i : a) {
				
				System.out.print(i + ", ");
			}
			
			int tempInt1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a value from the array"));
			
			boolean intNotFound = true;
			for(int i = 0; i < a.length; i++) {
				
				if(a[i] == tempInt1) {
					
					int tempInt2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a value to replace " + tempInt1));
					a[i] = tempInt2;
					intNotFound = false;
				}
			}
			if(intNotFound) {
				
				System.out.println("\n\n" + "The value you were searching for couldn't be found");
				break;
			}
		}
	}
}
