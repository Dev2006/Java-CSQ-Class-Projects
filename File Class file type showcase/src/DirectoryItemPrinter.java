import java.io.File;
import javax.swing.JOptionPane;

public class DirectoryItemPrinter {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Users\\Mohit Sharma\\Desktop");
			
			if(f.isDirectory()) {
				
				printDirectoryItems(f);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void printDirectoryItems(File f) {
		File[] items = f.listFiles();
		String [] extensions = new String[items.length];
		
		//Setting values for unique items
		for(int i = 0; 0 < extensions.length; i++) {
			
			try {
				
				extensions[i] = items[i].getName().substring(items[i].getName().lastIndexOf('.'));
			} catch (StringIndexOutOfBoundsException e) {
				
				
			}
		}
		
		//prints which files you have
		System.out.println("Files in directory:");
		for (String i : extensions) System.out.println(i);
		
		//asks user which files to show
		String extensionChoice = JOptionPane.showInputDialog("Which files do you want to view");
		
		//Shows the correct files
		System.out.println("\n" + extensionChoice + " Files:");
		for (int i = 0; i < items.length; i++) {
			
			if(extensions[i].equals(extensionChoice)) {
				
				System.out.println(items[i].getName());
			}
		}
	}
}
