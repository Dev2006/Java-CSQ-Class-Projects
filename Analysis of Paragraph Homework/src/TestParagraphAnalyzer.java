import java.util.Scanner;

public class TestParagraphAnalyzer {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the text you want to be analyzed");
		String para = reader.nextLine();
		
		ParagraphAnalyzer pa = new ParagraphAnalyzer(para);
		System.out.println();
		pa.printAnalysis();
		
		reader.close();
	}
}
