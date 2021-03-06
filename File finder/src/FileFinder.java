import java.io.File;
import javax.swing.JOptionPane;

public class FileFinder {
	
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
		
		try {
			
			for(int i = 0; i < extensions.length; i++) {
				
				if(items[i].getName().substring(items[i].getName().lastIndexOf('.')) != null) {
					
					extensions[i] = items[i].getName().substring(items[i].getName().lastIndexOf('.'));
				} else {
					
					extensions[i] = "-";
				}
			}
		} catch (StringIndexOutOfBoundsException e) {}
		
		//prints which files you have
		System.out.println("Files in directory:");
		for (String i : extensions) System.out.println(i);
		
		//asks user which files to show
		String extensionChoice = "";
		extensionChoice = JOptionPane.showInputDialog("Which files do you want to view");
		
		//Shows the correct files
		System.out.println("\n" + extensionChoice + " Files:");
		for (int i = 0; i < extensions.length; i++) {
			
			if(extensions[i].equals(extensionChoice)) {
				
				System.out.println(items[i].getName());
			}
		}
	}
}
