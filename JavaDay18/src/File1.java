import java.io.File;
import java.util.Date;

public class File1 {
	
	public static void main(String[] args) {
		
		try {
			
			File f = new File("c://Users//Mohit Sharma//Desktop//The.7.Habits.Of.Highly.Effective.People");
			File[] fList = f.listFiles();
			
			for (File i : fList) {
				System.out.println("File name : " + i.getName());
				System.out.println("File path : " + i.getPath());
				Date date = new Date(i.lastModified());
				System.out.println("Last modified : " + date);
				System.out.println("Length : " + i.length());
				System.out.println();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
