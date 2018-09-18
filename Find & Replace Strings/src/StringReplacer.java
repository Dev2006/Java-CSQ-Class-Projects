import java.util.Scanner;

public class StringReplacer {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter some text to find and replace words from");
		String text = reader.nextLine();
		
		for(;;) {
			
			System.out.println("\n" + "Press 1 to find and replace a keyword"
					+ "\n" + "Press 2 to print your text");
			
			int tempChoice = reader.nextInt();
			
			if(tempChoice == 1) {
				
				System.out.println("\n" + "Enter keyword you want to replace");
				String findKeyword = reader.next();
				System.out.println("\n" + "Enter keyword you want to replace");
				String replacingKeyword = reader.next();
				
				text = replace(text, findKeyword, replacingKeyword); 	
			} else if(tempChoice == 2){
				
				System.out.println("\n" + text);
				break;
			}
		}
		
		reader.close();
	}
	
	public static String replace(String text, String findKeyword, String replaceKeyword) {
		
		return text.replace(findKeyword, replaceKeyword);
	}
}
